package br.com.aula4;

import java.util.Scanner;

public class Exemplo {
	
	public static void main(String[] args) {
//		Endereco endereco = new Endereco();
//		
//		endereco.setLogradouro("Rua Alagoas");
//		endereco.setBairro("Centro");
//		endereco.setCep("86010-520");
//		endereco.setNumero(780);
//		endereco.setComplemento("Poeta Mario Romagnoli, apto 301");
//		endereco.setCidade("Londrina");
////		endereco.setEstado("Paraná");
//		
//		System.out.println(endereco.getEstado());
//		
//		Funcionario funcionario1 = new Funcionario();
//		funcionario1.setNome("Joao");
//		funcionario1.setRg("123456789");
//		funcionario1.setCpf("987654321");
//		funcionario1.setDataNascimento("1990-03-21");
//		funcionario1.setSalario(1000.0);
//		
//		Chefe chefe1 = new Chefe();
		
		Livro livro = new Livro();
		livro.setTitulo("Microbiologia");
		livro.setAutor("Tortora");
		livro.setAno(2012);
		livro.setGenero("Estudo");
		livro.setPaginas(1000);
		livro.setVolume(12);
		Editora editora = new Editora();
		editora.setCnpj("123456789");
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Alagoas");
		endereco.setBairro("Centro");
		endereco.setCep("86010-520");
		endereco.setNumero(780);
		endereco.setComplemento("Poeta Mario Romagnoli, apto 301");
		endereco.setCidade("Londrina");
		endereco.setEstado("Paraná");
		editora.setEndereco(endereco);
		editora.setNomeFantasia("Flexa");
		livro.setEditora(editora);
		
		System.out.println(livro.getEditora().getEndereco().getLogradouro());
		
		Revista revista = new Revista();
		Editora editora1 = new Editora();
		Endereco endereco1 = new Endereco();
		
		
	}
	
}
