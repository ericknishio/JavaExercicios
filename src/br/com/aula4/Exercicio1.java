package br.com.aula4;

//Criar objeto revista, com editora e endereço diferente do já cadastrado


public class Exercicio1 {

	public static void main(String[] args) {
		Revista revista2 = new Revista();
		Editora editora2 = new Editora();
		Endereco endereco = new Endereco();
		endereco.setBairro("Centro");
		endereco.setCep("86010520");
		endereco.setCidade("Londrina");
		endereco.setComplemento("Cemitério São Pedro");
		endereco.setEstado("Parana");
		endereco.setLogradouro("Alagoas");
		endereco.setNumero(780);
		editora2.setCnpj("083271");
		editora2.setNomeFantasia("Martins");
		editora2.setEndereco(endereco);
		revista2.setEditora(editora2);
		revista2.setManchete("Heloísa morre de sono");
		revista2.setAno(2020);
		revista2.setTitulo("Java");
		revista2.setPaginas(15);
		System.out.println(revista2.getTitulo());
		System.out.println(revista2.getEditora().getNomeFantasia());
		System.out.println(revista2.getEditora().getEndereco().getCidade());
	}
}
