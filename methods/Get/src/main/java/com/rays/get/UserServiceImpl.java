package com.rays.get;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class UserServiceImpl implements UserServiceInt {
	@Autowired
	private UserDAOInt dao;

	@Override
	public UserDTO findById(Long id) {
		UserDTO dto =dao.findByPk(id);
		return dto;
	}

}
