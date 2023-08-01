package Exceptions;

public class ArgumentCountException extends Exception {

	public ArgumentCountException() {
		super("3 arguments are required: word 1, word2 and relation");
	}

}
