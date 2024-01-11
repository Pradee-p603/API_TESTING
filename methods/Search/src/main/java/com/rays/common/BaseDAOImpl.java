package com.rays.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.dto.UserDTO;

public abstract class BaseDAOImpl<T extends BaseDTO> implements BaseDAOInt<T> {
	@PersistenceContext
	protected EntityManager entityManager;

	public abstract Class<T> getDTOClass();

	public TypedQuery<T> crerateCriteria(T dto) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> cq = builder.createQuery(getDTOClass());
		Root<T> qRoot = cq.from(getDTOClass());

		TypedQuery<T> tq = entityManager.createQuery(cq);
		return tq;

	}

	@Override
	public List<T> search(T dto, int pageNo, int PageSize) {
		TypedQuery<T> tq = crerateCriteria(dto);
		if (PageSize > 0) {
			tq.setFirstResult(pageNo * PageSize);
			tq.setMaxResults(PageSize);

		}
		List<T> list = tq.getResultList();
		list.forEach(e -> System.out.println(e));

		return list;
	}

}
