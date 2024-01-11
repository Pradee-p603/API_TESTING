package com.rays.save;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "User")
public class UserCtl {
	@Autowired
	private UserServiceInt service;

	public ORSResponse validate(BindingResult bindingResult) {
		ORSResponse res = new ORSResponse(true);

		if (bindingResult.hasErrors()) {
			res.setSuccess(false);
			Map<String, String> errors = new HashMap<String, String>();

			List<FieldError> list = bindingResult.getFieldErrors();
			list.forEach(e -> {
				errors.put(e.getField(), e.getDefaultMessage());
			});
			res.addInputError(errors);
		}
		return res;
	}

	@PostMapping("save")
	public ORSResponse save(@RequestBody @Valid UserForm form, BindingResult bindingResult, HttpServletRequest req) {

		ORSResponse res = validate(bindingResult);

		if (!res.isSuccess()) {
			return res;
		}

		UserDTO dto = form.getDTO();

		if (dto.getId() != null && dto.getId() > 0) {
			service.update(dto);
		} else {
			service.add(dto);
		}
		res.addData(dto.getId());
		return res;
	}

}
