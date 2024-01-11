package com.rays.common;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseCTL<F extends BaseForm, T extends BaseDTO, S extends BaseServiceInt<T>> {
	@Autowired
	private S baseService;

}
