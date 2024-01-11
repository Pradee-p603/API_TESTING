package com.rays.delete;

public interface UserServiceInt {
	public UserDTO findById(long id);

	public UserDTO delete(long id);

}
