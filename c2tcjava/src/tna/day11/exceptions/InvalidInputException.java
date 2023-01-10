package tna.day11.exceptions;

import java.util.Arrays;

public class InvalidInputException extends Exception{

	public InvalidInputException() {
		super();
	}

	public InvalidInputException(String msg) {
		super(msg);
	}

	@Override
	public String toString() {
		return "InvalidInputException:" + getMessage();
	}
	
	

}
