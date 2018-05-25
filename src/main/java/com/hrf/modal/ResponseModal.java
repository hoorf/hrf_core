package com.hrf.modal;

public class ResponseModal extends JsonModal {

	private static final long serialVersionUID = 1L;

	private String code;
	private String msg;
	private Object object;

	public ResponseModal(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public ResponseModal(String code, Object object) {
		super();
		this.code = code;
		this.object = object;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
