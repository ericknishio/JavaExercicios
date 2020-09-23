package br.com.aula4;
//Criar uma classe Periodico, e um objeto periodico com editora e endereço diferentes dos já cadastrados

public class exercicio2 {

	public static void main(String[] args) {
		Periodico periodico = new Periodico();
		Editora editora3 = new Editora();
		Endereco endereco3 = new Endereco();
		endereco3.setBairro("Sofredor");
		endereco3.setCep("666666");
		endereco3.setCidade("Tô perdida");
		endereco3.setComplemento("Misericordia");
		endereco3.setEstado("Socorro");
		endereco3.setLogradouro("Alguem me ajuda");
		endereco3.setNumero(666);
		periodico.setAno(2021);
		periodico.setArea("Computação");
		periodico.setPaginas(54);
		periodico.setQualisCapes("A1");
		periodico.setTitulo("Computação da sofrencia");
		periodico.setVolume(66);
		periodico.setEditora(editora3);
		editora3.setCnpj("1234567");
		editora3.setNomeFantasia("Java sofredor");	
		editora3.setEndereco(endereco3);
		System.out.println(periodico.getEditora().getNomeFantasia());
	}
}
