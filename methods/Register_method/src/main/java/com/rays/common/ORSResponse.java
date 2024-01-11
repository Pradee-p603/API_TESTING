package com.rays.common;

import java.util.HashMap;
import java.util.Map;

public class ORSResponse {
	
	public static final String INPUT_ERRORS = "inputerrors";
	public static final String DATA = "data";
	public static final String MESSAGE = "message";
	public static final String NEXT = "next";
	

	private boolean success;

	private Map<String, Object> result = new HashMap<String, Object>();

	public ORSResponse(boolean success) {
		this.success = success;
	}

	public ORSResponse() {
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}
	public void addData(Object value) {
		result.put(DATA, value);
	}
	public void addInputErrors(Object value) {
		result.put(INPUT_ERRORS, value);
	}
	public void addMessage(Object value) {
		result.put(MESSAGE, value);
	}
	public void addnextData(Object value) {
		result.put(NEXT, value);
	}
	public void addResult(String key,Object value) {
		result.put(key, value);
	}

}
