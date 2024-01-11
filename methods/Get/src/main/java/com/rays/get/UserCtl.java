package com.rays.get;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value  = "User")
public class UserCtl {
	@Autowired
	private UserServiceInt service;
	
	@GetMapping("/get/{id}")
	public ORSResponse get(@PathVariable Long id, HttpServletRequest req) {

		ORSResponse res = new ORSResponse(true);

		UserDTO dto = service.findById(id);

		if (dto == null) {
			res.addResult("id", 0);
		} else {
			res.addData(dto);
		}
		return res;
	}
}
