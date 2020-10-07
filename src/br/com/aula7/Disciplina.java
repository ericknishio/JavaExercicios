package br.com.aula7;

public class Disciplina {

	// ATRIBUTOS
	private String nomeDisciplina;
	private String nomeProfessor;
	private Double cargaHoraria;
	private Integer anoDisciplina;
	private Integer semestreDisciplina;
	private String departamentoDisciplina;

	// GET SET
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Integer getAnoDisciplina() {
		return anoDisciplina;
	}

	public void setAnoDisciplina(Integer anoDisciplina) {
		this.anoDisciplina = anoDisciplina;
	}

	public Integer getSemestreDisciplina() {
		return semestreDisciplina;
	}

	public void setSemestreDisciplina(Integer semestreDisciplina) {
		this.semestreDisciplina = semestreDisciplina;
	}

	public String getDepartamentoDisciplina() {
		return departamentoDisciplina;
	}

	public void setDepartamentoDisciplina(String departamentoDisciplina) {
		this.departamentoDisciplina = departamentoDisciplina;
	}

	// CONSTRUTORES
	public Disciplina() {

	}

	public Disciplina(String nomeDisciplina, String nomeProfessor, Double cargaHoraria, Integer anoDisciplina,
			Integer semestreDisciplina, String departamentoDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.nomeProfessor = nomeProfessor;
		this.cargaHoraria = cargaHoraria;
		this.anoDisciplina = anoDisciplina;
		this.semestreDisciplina = semestreDisciplina;
		this.departamentoDisciplina = departamentoDisciplina;
	}
}
