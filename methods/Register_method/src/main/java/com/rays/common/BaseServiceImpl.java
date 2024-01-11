package com.rays.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl<T extends BaseDTO, D extends BaseDAOInt<T>> implements BaseServiceInt<T> {

	@Autowired
	protected D baseDao;


}
