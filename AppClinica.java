package main;

import java.util.Scanner;
import entidades.Paciente;
import lista.VetPaciente;

public class AppClinica {

	Scanner sc = new Scanner(System.in);
	boolean continuar = true;
	static VetPaciente vetor = new VetPaciente();

	public void menu() {
		
		int opcao;
		
		do {
			
			System.out.println("Seja Bem-vindo a nossa Clínica!"
					+ "\nSelecione um de nossos serviços dentre as opções abaixo"
					+ "\n1 - Cadastrar"
					+ "\n2- Consultar"
					+ "\n3 - Imprimir Cadastro"
					+ "\n4 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();
			
            switch (opcao) {
            case 1:
            	cadastrarPaciente(sc);
                break;

            case 2:
                this.consultar(sc);
                break;

            case 3:
                this.imprimirCadastro();
                break;

            case 4:
                System.out.println("Encerrando sistema...");
                sc.close();
                continuar = false;
                break;

            default:
                System.out.println("Opção inválida! Por favor, tente novamente.");
        }
    

			
		}while(opcao != 4);
			
		}
	
	private static void cadastrarPaciente(Scanner sc) {
		System.out.println("Insira os seguintes campos:/nNome do paciente:");
		String nome = sc.nextLine();
		
		System.out.println("CPF:");
		String cpf = sc.nextLine();	
		
		System.out.println("Data de Nascimento:");
		String DataNascimento = sc.nextLine();
	
		System.out.println("Historico:");
		String Historico = sc.nextLine();
	
		Paciente paciente = new Paciente(nome, cpf, DataNascimento, Historico);
		int resultado = vetor.insere(paciente);
		
		if(resultado == -1) {
			System.out.println("ERRO: A lista de pacientes se encontra cheia, tente novamente mais tarde.");
			
		}else if (resultado == -2) {
            System.out.println("Erro: Já existe um paciente com esse CPF cadastrado.");
		
		}else if (resultado == 0) {
            System.out.println("\nUsuário cadastrado com sucesso!\n");
          
		}
		
	}
	
	private static void consultar(Scanner sc) {
		System.out.println("Por favor, insira o CPF do paciente procurado: ");
		String cpf = sc.nextLine();
		int pos = vetor.pesquisa(cpf);
			
        if (pos != -1) {
            Paciente paciente = vetor.getPaciente(pos);
            if (paciente != null) {
                System.out.println("\n" + paciente.getNome() 
                + " | CPF: "  + paciente.getCPF() 
                + " | Data de Nascimento: " + paciente.getDataNascimento()
                + "Histórico: " + paciente.getHistorico());
            }
        } else {
            System.out.println("Paciente não encontrado.\n");
        }
    }
	
	 public void imprimirCadastro() {
	        System.out.println("Imprimindo dados de todos os pacientes:");
	        for (int i = 0; i < vetor.getNElem(); i++) {
	            Paciente paciente = vetor.getPaciente(i);
	            if (paciente != null) {
	                System.out.println("Nome: " + paciente.getNome() + 
	                                   "\nCPF: " + paciente.getCPF() + 
	                                   "\nData de Nascimento: " + paciente.getDataNascimento() + 
	                                   "\n");
	            }
		
		
	}
	
}
}
