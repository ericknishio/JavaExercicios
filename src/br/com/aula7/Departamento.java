package br.com.aula7;

public class Departamento {
	private String nomeDepartamento;
	private String nomeCentro;
	
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public String getNomeCentro() {
		return nomeCentro;
	}
	public void setNomeCentro(String nomeCentro) {
		this.nomeCentro = nomeCentro;
	}

	public Departamento(String nomeDepartamento, String nomeCentro) {
		super();
		this.nomeDepartamento = nomeDepartamento;
		this.nomeCentro = nomeCentro;
	}	
	
	
	public Departamento() {
	}
	
	public static Integer disciplinasTotais() {
		return null;
	}
	public static Integer disciplinasPorSemestres() {
		return null;
	}
}
