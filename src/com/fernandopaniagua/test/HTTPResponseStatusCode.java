package com.fernandopaniagua.test;

public enum HTTPResponseStatusCode {
	OK, BAD_REQUEST, NOT_FOUND, INTERNAL_SERVER_ERROR;
	
	public int getCode() {
		switch(this) {
		case OK:
			return 100;
		case BAD_REQUEST:
			return 400;
		case NOT_FOUND:
			return 404;
		case INTERNAL_SERVER_ERROR:
			return 500;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		PeticionHTTP p = new PeticionHTTP();
		p.rsc = HTTPResponseStatusCode.NOT_FOUND;
		System.err.println(p.rsc.getCode());
	}
}


class PeticionHTTP {
	public HTTPResponseStatusCode rsc;
	
}