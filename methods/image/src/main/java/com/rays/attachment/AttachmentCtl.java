package com.rays.attachment;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "Attachment")
public class AttachmentCtl {

	@Autowired
	private AttachmentServiceInt attachmentService;

	@PostMapping("/profilePic")
	public ORSResponse uploadPic(@RequestParam("file") MultipartFile file, HttpServletRequest req) {

		AttachmentDTO doc = new AttachmentDTO(file);

		doc.setDescription("profile pic");

		Long imageId = attachmentService.add(doc);

		ORSResponse res = new ORSResponse(true);

		res.addResult("imageId", imageId);

		res.addMessage("Image added successfully...!!!");

		return res;
	}

	@GetMapping("/profilePic/{imageId}")
	public @ResponseBody void downloadPic(@PathVariable Long imageId, HttpServletResponse response) {

		AttachmentDTO attachmentDTO = attachmentService.findByPK(imageId);

		try {
			if (attachmentDTO != null) {
				response.setContentType(attachmentDTO.getType());
				OutputStream out = response.getOutputStream();
				out.write(attachmentDTO.getDoc());
				out.close();
			} else {
				response.getWriter().write("ERROR: File not found");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
