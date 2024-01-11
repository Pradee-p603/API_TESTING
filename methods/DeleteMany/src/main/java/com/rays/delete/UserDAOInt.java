package com.rays.delete;

public interface UserDAOInt {
	public UserDTO findByPk(Long pk);
	
	public void delete(UserDTO dto);

}
