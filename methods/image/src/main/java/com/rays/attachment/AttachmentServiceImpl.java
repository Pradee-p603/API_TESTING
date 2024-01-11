package com.rays.attachment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AttachmentServiceImpl implements AttachmentServiceInt {

	@Autowired
	protected AttachmentDAOInt dao;

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(AttachmentDTO dto) {
		long pk = dao.add(dto);
		return pk;
	}

	@Transactional(readOnly = true)
	public AttachmentDTO findByPK(long pk) {
		AttachmentDTO dto = dao.findByPK(pk);
		return dto;
	}

}
