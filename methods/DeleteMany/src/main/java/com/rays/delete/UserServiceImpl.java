package com.rays.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserServiceInt {
	@Autowired
	private UserDAOInt dao;

	@Override
	public UserDTO findById(long id) {
		UserDTO dto = dao.findByPk(id);
		return dto;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public UserDTO delete(long id) {

		UserDTO dto = findById(id);
		dao.delete(dto);
		return dto;
		
	}

}
