/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package aj_4_api.aj4lab04_01_01.aj4lab04_01_01.src.main.java.br.com.globalcode.aj4.annotations;


public class Cliente {

	private int codigo;

	@GUIVisible(nomeCampo = "Nome:")
	private String nome;

	@GUIVisible(nomeCampo = "Endereco:")
	private String endereco;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
