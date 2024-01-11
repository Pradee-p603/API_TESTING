package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.BaseDAOInt;
import com.rays.dto.UserDTO;

@Repository
public class UserDAOImpl extends BaseDAOImpl<UserDTO> implements UserDAOInt {

	

	@Override
	public Class<UserDTO> getDTOClass() {

		return UserDTO.class;
	}


}