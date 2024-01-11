package com.rays.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDAOImpl<T extends BaseDTO> implements BaseDAOInt<T> {
	@PersistenceContext
	private EntityManager entityManager;

	public abstract Class<T> getDTOClass();

	@Override
	public long add(T dto) {
		entityManager.persist(dto);

		return dto.getId();
	}

}
