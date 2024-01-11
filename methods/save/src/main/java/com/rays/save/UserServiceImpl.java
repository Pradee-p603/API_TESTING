package com.rays.save;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserServiceInt{
	@Autowired
	private UserDAOInt dao;

	@Override
	public void update(UserDTO dto) {
		dao.update(dto);
		
	}

	@Override
	public long add(UserDTO dto) {
	Long id =	dao.add(dto);
		return dto.getId();
	}

}
