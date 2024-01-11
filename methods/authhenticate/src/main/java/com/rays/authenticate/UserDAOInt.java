package com.rays.authenticate;

public interface UserDAOInt {
	public UserDTO findByUniqueKey(String attribute, String value);
	
	public UserDTO findByLoginId(String loginId);

}
