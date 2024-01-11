package com.rays.attachment;

public interface AttachmentDAOInt {

	public long add(AttachmentDTO dto);
	
	public AttachmentDTO findByPK(long pk);

}
