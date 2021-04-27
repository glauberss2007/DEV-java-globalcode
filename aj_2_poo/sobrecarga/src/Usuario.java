package sobrecarga.src;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Usuario {

	private String nome;
	private String sobreNome;
	private int idade;
	private Date dataNascimento;
	private Rg rg;

	public void salva(String nome, String sobreNome, Date dataNascimento){
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataNascimento = dataNascimento;
		this.idade = setaIdade(dataNascimento);
	}

	private int setaIdade(Date dataNascimento) {
		Calendar dataNasc = Calendar.getInstance();
		dataNasc.setTime(dataNascimento);

		Calendar dataHoje = Calendar.getInstance();

		int idade = dataHoje.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);

		dataNasc.add(Calendar.YEAR, idade);

		if (dataHoje.before(dataNasc)) {
			idade--;
		}

		return idade;
	}

	public void salva(String nome, String sobreNome, Date dataNascimento, Rg rg){
		salva(nome, sobreNome, dataNascimento);
		this.rg = rg;
	}

	public void imprime(){
		System.out.println("################	Cadastro de Usuario		##################");
		System.out.println("Nome: "+nome);
		System.out.println("Sobrenome: " +sobreNome);
		System.out.println("Data de Nascimento: "+new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento));
		System.out.println("Idade: "+ idade);
		System.out.println("RG: "+ (rg !=null ? rg.getNumero() : "Nao informado"));
		System.out.println("CPF: "+ ( (rg != null && rg.getCpf() != null ) ? rg.getCpf().getNumero() : "Nao informado") );
		System.out.println();
	}

	// getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Rg getRg() {
		return rg;
	}
	public void setRg(Rg rg) {
		this.rg = rg;
	}
}
