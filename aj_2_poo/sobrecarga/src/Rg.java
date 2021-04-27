package sobrecarga.src;

import java.util.Date;


public class Rg {

	private String numero;
	private String orgao;
	private Date dataExpedicao;
	private Cpf cpf;
	
	public Rg salva(String numero, String orgao, Date dataExpedicao){
		Rg rg = new Rg();
		rg.numero = numero;
		rg.orgao = orgao;
		rg.dataExpedicao = dataExpedicao;
		return rg;
	}
	
	public Rg salva(String numero, String orgao, Date dataExpedicao, Cpf cpf){
		Rg rg = salva(numero, orgao, dataExpedicao);
		rg.cpf = cpf;
		return rg;
	}
	
	// getters and setters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	public Date getDataExpedicao() {
		return dataExpedicao;
	}
	public void setDataExpedicao(Date dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}
	public Cpf getCpf() {
		return cpf;
	}
	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}
}
