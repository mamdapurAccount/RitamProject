package com.cg;

public class Sender<T> {

	T msg;
	
	
	public T getMsg() {
		return msg;
	}


	public void setMsg(T msg) {
		this.msg = msg;
	}


	@Override
	public String toString() {
		return "Sender [msg=" + msg + "]";
	}


	
}
