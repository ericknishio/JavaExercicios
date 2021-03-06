package br.com.aula4;

public class Editora {
	private String nomeFantasia;
	private String cnpj;
	private Endereco endereco;
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	//Construtor sem argumentos
	public Editora() {
		
	}
	
	public Editora(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	//Construtor completo
	public Editora(String nomeFantasia, String cnpj, Endereco endereco) {
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
}
