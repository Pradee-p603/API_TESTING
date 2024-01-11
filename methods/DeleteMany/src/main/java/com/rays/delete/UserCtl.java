package com.rays.delete;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "User")
public class UserCtl {
	@Autowired
	private UserServiceInt service;

	@PostMapping("deleteMany/{ids}")
	public ORSResponse deleteMany(@PathVariable String[] ids, @RequestBody UserForm form) {
		ORSResponse res = new ORSResponse(true);
		System.out.println("outside try block");
		
		try {
			System.out.println("inside try");
			for (String id : ids) {
				System.out.println("inside for loop");
				UserDTO dto = service.delete(Long.parseLong(id));
			}
			res.setSuccess(true);
			res.addMessage("Records Deleted Successfully");

		} catch (Exception e) {
			res.setSuccess(false);
			res.addMessage(e.getMessage());
		}
		return res;
	}
}
