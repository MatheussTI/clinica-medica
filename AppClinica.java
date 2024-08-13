package main;

import java.util.Scanner;
import entidades.Paciente;
import lista.VetPaciente;

public class AppClinica {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
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
			
				switch(opcao) {
					case 1:
						
						cadastrarPaciente();
						break;
					
					case 2:
						
						consultar();
						break;
					case 3:
					
					case 4:
					
					default:
						System.out.println("Insira uma opção válida!: ");
				}
			
		}while(opcao != 4);
			
		}
	
	private static void cadastrarPaciente() {
		System.out.println("Insira os seguintes campos:/nNome do paciente:");
		String nome = sc.nextLine();
		
		System.out.println("CPF:");
		String cpf = sc.nextLine();
		
		System.out.println("Data de Nascimento:");
		String DataNascimento = sc.nextLine();
	
		System.out.println("Historico:");
		String Historico = sc.nextLine();
	
		Paciente paciente = new Paciente(nome, cpf, DataNascimento, Historico);
		
	}
	
	private static void consultar() {
		System.out.println("Por favor, insira o CPF do paciente procurado: ");
		String cpf = sc.next();
		
		//...
	}
	
}
