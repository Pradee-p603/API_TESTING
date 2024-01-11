package com.rays.save;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAOInt {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void update(UserDTO dto) {
		entityManager.merge(dto);

	}

	@Override
	public long add(UserDTO dto) {
		entityManager.persist(dto);
		return dto.getId();
	}

}
