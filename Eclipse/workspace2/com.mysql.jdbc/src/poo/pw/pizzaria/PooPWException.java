package poo.pw.pizzaria;


public class PooPWException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PooPWException(String msg) {
		super(msg);
	}

	public PooPWException(String msg, Exception exception) {
		super(msg, exception);
	}
	
}
