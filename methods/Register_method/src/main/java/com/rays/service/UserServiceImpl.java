package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseDAOInt;
import com.rays.common.BaseServiceImpl;
import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<UserDTO, UserDAOInt> implements UserServiceInt{

	@Override
	public UserDTO register(UserDTO dto) {
		 baseDao.add(dto);
		
		return dto;
	}

}
