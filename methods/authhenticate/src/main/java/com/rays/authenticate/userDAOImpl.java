package com.rays.authenticate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import net.bytebuddy.asm.Advice.Return;

@Repository
public class userDAOImpl implements UserDAOInt {

	
	@PersistenceContext
	private EntityManager entityManager;

	public UserDTO findByLoginId(String loginId) {
		UserDTO dto = findByUniqueKey("loginId", loginId);
		return dto;

	}

	

	public UserDTO findByUniqueKey(String attribute, String value) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<UserDTO> cq = builder.createQuery(UserDTO.class);
		Root<UserDTO> qRoot = cq.from(UserDTO.class);
		Predicate condition = builder.equal(qRoot.get(attribute), value);
		cq.where(condition);
		TypedQuery<UserDTO> tq = entityManager.createQuery(cq);
		UserDTO dto = null;
		List list = tq.getResultList();
		if (list.size() > 0) {
			dto = (UserDTO) list.get(0);
		}
		return dto;
	}



	

}
