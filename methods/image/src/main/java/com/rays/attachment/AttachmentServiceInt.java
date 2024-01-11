package com.rays.attachment;

public interface AttachmentServiceInt {

	public long add(AttachmentDTO dto);
	
	public AttachmentDTO findByPK(long pk);

}
