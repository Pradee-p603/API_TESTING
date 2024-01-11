package com.rays.authenticate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserServiceInt {
	@Autowired
	private UserDAOInt dao;
	
	

	

	public UserDTO authenticate(String LoginId, String password) {
		UserDTO dto = dao.findByLoginId(LoginId);
		if (dto != null) {
			if (password.equals(dto.getPassword())) {
				return dto;

			}

		}
		return null;
	}
}
