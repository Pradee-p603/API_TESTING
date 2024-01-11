package com.rays.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public class BaseServiceImpl<T extends BaseDTO, D extends BaseDAOInt<T>> implements BaseServiceInt<T> {
	@Autowired
	protected D baseDao;

	@Override
	public List<T> search(T dto, int pageNo, int pageSize) {
		return baseDao.search(dto, pageNo, pageSize);
	}

	
}
