package domain.exceptions;

public class DomainException extends RuntimeException{

	/**
	 * A vari�vel abaixo, que � um padr�o de vers�o, � obrigat�ria porque � uma classe serializable. 
	 */
	private static final long serialVersionUID = 1L; 
	
	public DomainException(String msg) {
		super(msg);
	}

}
