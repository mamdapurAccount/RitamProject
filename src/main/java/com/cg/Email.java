package com.cg;

public class Email {
	
	String cc;
	String body;
	public Email(String cc, String body) {
		super();
		this.cc = cc;
		this.body = body;
	}
	@Override
	public String toString() {
		return "Email [cc=" + cc + ", body=" + body + "]";
	}
	

}
