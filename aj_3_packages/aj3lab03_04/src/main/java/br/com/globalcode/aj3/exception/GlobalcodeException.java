package aj_3_packages.aj3lab03_04.aj3lab03_04.src.main.java.br.com.globalcode.aj3.exception;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
public class GlobalcodeException extends Exception {

	public GlobalcodeException(String mensagem, Exception e) {
		super(mensagem, e);
	}

	public GlobalcodeException(String mensagem) {
		super(mensagem);
	}
}
