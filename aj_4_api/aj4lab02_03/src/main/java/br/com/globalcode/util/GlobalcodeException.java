/**
 * @author Globalcode
 */
package aj_4_api.aj4lab02_03.aj4lab02_03.src.main.java.br.com.globalcode.util;

public class GlobalcodeException extends Exception {

    public GlobalcodeException(Exception e, String mensagem) {
        super(mensagem, e);
    }

    public GlobalcodeException(String mensagem) {
        super(mensagem);
    }

}
