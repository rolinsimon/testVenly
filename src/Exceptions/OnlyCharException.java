package Exceptions;

public class OnlyCharException extends Exception {

	public OnlyCharException() {
		super("Only character fron a to z are allowed");
		System.out.println("Only character fron a to z are allowed");
	}

}
