package br.com.aula7;

public class Departamento {

	// ATRIBUTOS
	private String nomeDepartamento;
	private String nomeCentro;

	// GET SET
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

	// CONSTRUTORES
	public Departamento() {
	}

	public Departamento(String nomeDepartamento, String nomeCentro) {
		this.nomeDepartamento = nomeDepartamento;
		this.nomeCentro = nomeCentro;
	}

	// METODOS
	public static Integer disciplinasTotais() {
		return null;
	}

	public static Integer disciplinasPorSemestres() {
		return null;
	}
}
