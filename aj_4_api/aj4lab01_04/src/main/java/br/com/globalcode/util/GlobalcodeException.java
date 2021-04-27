/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */

package aj_4_api.aj4lab01_04.aj4lab01_04.src.main.java.br.com.globalcode.util;

public class GlobalcodeException extends Exception {

	public GlobalcodeException(String mensagem, Exception e) {
		super(mensagem, e);
	}

	public GlobalcodeException(String mensagem) {
		super(mensagem);
	}
}
