package br.com.aula5;

public class Heloisa extends Pessoa {
	private String denis;
	
	public Heloisa() {
		
	}
	
	public Heloisa(String denis, 
			String nome, 
			Integer idade,
			Double altura,
			String sexo,
			String nacionalidade) {
		this.denis = denis;
		this.setNome(nome);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setSexo(sexo);
		this.setNacionalidade(nacionalidade);
	}
}
