package sobrecarga.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class TestaSobrecarga {
	
	public static void main(String[] args) throws ParseException {
		
		int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 0:
            	System.out.println("Fim da execucao, Ate!!!!");
            	break;
            	
            case 1:
                salva();
                break;
                
            case 2:
                salvaComRG();
                break;
                
            case 3:
                salvaComCPF();
                break;
            
            default:
                System.out.println("Opcao digitada: "+opcao +" \nVc digitou uma opção inválida animal.\n");
            }
        } while(opcao != 0);
		
	}
	
	public static void menu(){
        System.out.println("\tCadastro de clientes");
        System.out.println("0. Fim");
        System.out.println("1. Salva usuario");
        System.out.println("2. Salva usuario com RG");
        System.out.println("3. Salva usuario com CPF");
        System.out.println("Opcao:");
    }

    public static void salva() throws ParseException{
        System.out.println("##########	Salva usuario ##########");
        Scanner entradaDados = new Scanner(System.in);
        System.out.print("\nDigite o nome: ");
		String nome = entradaDados.nextLine();
		
        System.out.print("\nDigite o sobrenome: ");
		String sobreNome = entradaDados.nextLine();
		
        System.out.print("\nDigite a data de nascimento (FORMATO dd/MM/yyyy): ");
		String dataStr = entradaDados.nextLine();
		
		Usuario usuario = new Usuario();
		
		usuario.salva(nome, sobreNome, new SimpleDateFormat("dd/MM/yyyy").parse(dataStr));
		usuario.imprime();
		
    }
    
    public static void salvaComRG() throws ParseException{
    	System.out.println("##########	Salva usuario com RG	##########");
        Scanner entradaDados = new Scanner(System.in);
        System.out.print("\nDigite o nome: ");
		String nome = entradaDados.nextLine();
		
        System.out.print("\nDigite o sobrenome: ");
		String sobreNome = entradaDados.nextLine();
		
        System.out.print("\nDigite a data de nascimento (FORMATO dd/MM/yyyy): ");
		String dataStr = entradaDados.nextLine();
		
        System.out.print("\nDigite o numero do RG: ");
        String numStr = entradaDados.nextLine();
        
        System.out.print("\nDigite o orgao do RG: ");
        String orgao = entradaDados.nextLine();
		
        System.out.print("\nDigite a data de expedicao do RG (FORMATO dd/MM/yyyy): ");
		String dataExpeStr = entradaDados.nextLine();
		
		Usuario usuario = new Usuario();
		
		usuario.salva(nome, sobreNome, new SimpleDateFormat("dd/MM/yyyy").parse(dataStr), new Rg().salva(numStr, orgao, new SimpleDateFormat("dd/MM/yyyy").parse(dataExpeStr)));
		usuario.imprime();
    }
    
    public static void salvaComCPF() throws ParseException{
    	System.out.println("##########	Salva usuario com CPF	##########");
        Scanner entradaDados = new Scanner(System.in);
        System.out.print("\nDigite o nome: ");
		String nome = entradaDados.nextLine();
		
        System.out.print("\nDigite o sobrenome: ");
		String sobreNome = entradaDados.nextLine();
		
        System.out.print("\nDigite a data de nascimento (FORMATO dd/MM/yyyy): ");
		String dataStr = entradaDados.nextLine();
		
        System.out.print("\nDigite o numero do RG: ");
        String numStr = entradaDados.nextLine();
        
        System.out.print("\nDigite o orgao do RG: ");
        String orgao = entradaDados.nextLine();
		
        System.out.print("\nDigite a data de expedicao do RG (FORMATO dd/MM/yyyy): ");
		String dataExpeStr = entradaDados.nextLine();
		
        System.out.print("\nDigite o numero do CPF: ");
        String numCpf = entradaDados.nextLine();
		
		Usuario usuario = new Usuario();
		
		Cpf cpf = new Cpf();
		cpf.setNumero(numCpf);
		
		Rg rg = new Rg();
		rg.salva(numStr, orgao,  new SimpleDateFormat("dd/MM/yyyy").parse(dataExpeStr), cpf);
		
		usuario.salva(nome, sobreNome, new SimpleDateFormat("dd/MM/yyyy").parse(dataStr), rg);
		usuario.imprime();
    }

}
