package domain.exceptions;

public class DomainException extends RuntimeException{

	/**
	 * A variável abaixo, que é um padrão de versão, é obrigatória porque é uma classe serializable. 
	 */
	private static final long serialVersionUID = 1L; 
	
	public DomainException(String msg) {
		super(msg);
	}

}
