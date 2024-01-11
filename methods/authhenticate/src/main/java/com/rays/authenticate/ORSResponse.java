package com.rays.authenticate;

import java.util.HashMap;
import java.util.Map;

public class ORSResponse {

	public static final String DATA = "data";
	public static final String Message = "message";
	public static final String INPUT_ERROR = "inputerror";
	public static final String NEXT = "next";
	private boolean success;

	private Map<String, Object> result = new HashMap<String, Object>();

	public ORSResponse() {

	}

	public ORSResponse(boolean success) {
		this.success = success;
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

	
	
	
	public void addInputError(Object value) {
		result.put(INPUT_ERROR, value);
	}
	public void addMessage(Object value) {
		result.put(Message, value);
	}
	public void addData(Object value) {
		result.put(DATA, value);
	}
	public void addNextData(Object value) {
		result.put(NEXT, value);
	}
	public void addaResult(String key ,Object value) {
		result.put(key, value);
	}

}
