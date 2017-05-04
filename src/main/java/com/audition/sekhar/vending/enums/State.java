package com.audition.sekhar.vending.enums;
public enum State {

	DEFAULT("INSERT COIN"),
	FINAL("THANK YOU");
	
	private String message;
	
	State(final String message){
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}
}
