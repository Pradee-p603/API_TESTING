package com.rays.common;

import java.util.List;

import com.rays.dto.UserDTO;

public interface BaseDAOInt<T extends BaseDTO> {

	public List<T> search(T dto, int pageNo, int PageSize);

}
