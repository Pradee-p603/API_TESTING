package com.rays.common;

import java.util.List;

public interface BaseServiceInt <T extends BaseDTO> {
	public List<T> search(T dto, int pageNo, int pageSize);
	 
	
}
