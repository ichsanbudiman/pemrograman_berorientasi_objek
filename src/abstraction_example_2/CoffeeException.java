package abstraction_example_2;

public class CoffeeException extends Exception {
    public CoffeeException() {
		super();
	}

	public CoffeeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CoffeeException(String message, Throwable cause) {
		super(message, cause);
	}

	public CoffeeException(String message) {
		super(message);
	}

	public CoffeeException(Throwable cause) {
		super(cause);
	}
}
