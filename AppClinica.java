package main;

import java.util.Scanner;
import entidades.Paciente;
import lista.VetPaciente;

public class AppClinica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
			
				
			
		}while(opcao != 4);
			
		}
	
	private void cadastrarPaciente(Scanner sc) {
		System.out.println("Insira os seguintes campos:/nNome do paciente:");
		String nome = sc.nextLine();
		
		System.out.println("CPF:");
		Long cpf = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Data de Nascimento:");
		String DataNascimento = sc.nextLine();
	
		System.out.println("Historico:");
		String Historico = sc.nextLine();
	
		Paciente paciente = new Paciente(nome, cpf, DataNascimento, Historico);
		
	}
}
