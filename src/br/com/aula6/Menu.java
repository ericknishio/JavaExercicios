package br.com.aula6;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String cadastrar;
	String logar;
	String seLogado;
	String opcao;
	String cpf;
	String dataNascimento;
	String email;
	Integer idade;
	String nome;
	String rg;
	String sexo;
	String telefone;
	
	System.out.println("Menu de opções:"
			+ "\n1 - Cadastrar Cliente"
			+ "\n2 - Cadastrar Gerente"
			+ "\n3 - Logar"
			+ "\n4 - Exibir Cliente");
			
	
	opcao = scan.next();
	
	
	switch (opcao) {
		case "1":
			System.out.println("Informe nome: " );
			nome = scan.next();
			System.out.println("Informe CPF: " );
			cpf = scan.next();
			System.out.println("Informe RG: " );
			rg = scan.next();
			System.out.println("Informe Data de Nascimento: " );
			dataNascimento = scan.next();
			System.out.println("Informe email: " );
			email = scan.next();
			System.out.println("Informe telefone: " );
			telefone = scan.next();
			System.out.println("Informe idade: ");
			idade = scan.nextInt();
			System.out.println("Informe sexo: " );
			sexo = scan.next();
		break;
		case "2":
			
			break;
		case "3":
				
		break;	
		case "4":
			Cadastro cadastro = new Cadastro();
			System.out.println(cadastro.ExibirCliente());
		break;
		}
	System.out.println("Menu de opções:"
			+ "\n1 - Cadastrar Cliente"
			+ "\n2 - Cadastrar Gerente"
			+ "\n3 - Logar"
			+ "\n4 - Exibir Cliente");
			
	opcao = scan.next();
	}
}
	
	
		// MENU
		// CADASTRAR
		// LOGAR
		// SE LOGADO
			// EXIBIR INFORMAÇÕES DA CONTA
			// EDITAR CADASTRO
			// EXCLUIR CONTA
			// SAIR

