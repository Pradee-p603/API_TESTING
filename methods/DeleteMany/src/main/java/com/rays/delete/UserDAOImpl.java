package com.rays.delete;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAOInt {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public UserDTO findByPk(Long pk) {
		UserDTO dto = entityManager.find(UserDTO.class, pk);
		return dto;
	}

	@Override
	public void delete(UserDTO dto) {
		System.out.println("in dlete");
		entityManager.remove(dto);
		
	}

}
