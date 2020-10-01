package br.com.aula6;

//Herda de Usuario
public class Cliente extends Usuario {
	private String email;
	private Integer telefone;
	private String sexo;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Cliente(String nome, Integer idade, String cpf, String rg, String dataNascimento, String email,
			Integer telefone, String sexo) {
		super(nome, idade, cpf, rg, dataNascimento);
		this.email = email;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	
}	
	
	//ATRIBUTOS  Ok!
	
	//GET SET  Ok!
	
	//CONSTRUTOR  Ok!
	
	//MÉTODOS  Não OK!

