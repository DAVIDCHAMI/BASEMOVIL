package co.com.todo1.exceptions.comunes;

public class PropertiesDoesNotLoadException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PropertiesDoesNotLoadException(Exception e) {
		super(e);
	}
}
