package br.com.aula6;

import java.util.List;

//Herda de Usuario
public class Cliente extends Usuario {
	
	private String email;
	private List<String> telefones;
	private ESexo sexo;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ESexo getSexo() {
		return sexo;
	}
	public void setSexo(ESexo sexo) {
		this.sexo = sexo;
	}
	public List<String> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}
	public Cliente() {
		
	}
	
	public Cliente(String nome, Integer idade, String cpf, String rg, String dataNascimento, String email,
			List<String> telefones, ESexo sexo) {
		super(nome, idade, cpf, rg, dataNascimento);
		this.email = email;
		this.telefones = telefones;
		this.sexo = sexo;
	}
	
}