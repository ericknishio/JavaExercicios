package br.com.aula6;

//Herda de Usuario
public class Gerente extends Usuario {
	
	private String setorResponsavel;
	private Double salario;
	
	public String getSetorResponsavel() {
		return setorResponsavel;
	}
	public void setSetorResponsavel(String setorResponsavel) {
		this.setorResponsavel = setorResponsavel;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Gerente() {
		
	}
	
	public Gerente(String nome, Integer idade, String cpf, String rg, String dataNascimento, String setorResponsavel,
			Double salario) {
		super(nome, idade, cpf, rg, dataNascimento);
		this.setorResponsavel = setorResponsavel;
		this.salario = salario;
	}
	
}