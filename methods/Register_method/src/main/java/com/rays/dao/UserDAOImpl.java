package com.rays.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.UserDTO;

@Service
@Transactional
public class UserDAOImpl extends BaseDAOImpl<UserDTO> implements UserDAOInt {

	@Override
	public Class<UserDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return UserDTO.class;
	}

	


}
