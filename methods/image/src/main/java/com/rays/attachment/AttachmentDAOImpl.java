package com.rays.attachment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class AttachmentDAOImpl implements AttachmentDAOInt {

	@PersistenceContext
	protected EntityManager entityManager;

	public long add(AttachmentDTO dto) {
		entityManager.persist(dto);
		return dto.getId();
	}

	
	public AttachmentDTO findByPK(long pk) {
		AttachmentDTO dto = entityManager.find(AttachmentDTO.class, pk);
		return dto;
	}

}
