/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package aj_3_packages.aj3lab01_02.aj3lab01_02.src.main.java.br.com.globalcode.aj3.banking.impostos;

public interface Tributavel {
	public String getDescricaoTributavel();

	public String getNomeImposto();

	public double calcularImpostos();
}
