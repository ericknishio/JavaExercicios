package br.com.aula7;

public class Curso {

	// ATRIBUTO
	private String nomeCurso;
	private Integer quantidadeAluno;
	private Integer quantidadeSemestres;

	// GET SET
	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Integer getQuantidadeAluno() {
		return quantidadeAluno;
	}

	public void setQuantidadeAluno(Integer quantidadeAluno) {
		this.quantidadeAluno = quantidadeAluno;
	}

	public Integer getQuantidadeSemestres() {
		return quantidadeSemestres;
	}

	public void setQuantidadeSemestres(Integer quantidadeSemestres) {
		this.quantidadeSemestres = quantidadeSemestres;
	}

	// CONSTRUTOR
	public Curso() {
	}

	public Curso(String nomeCurso, Integer quantidadeAluno, Integer quantidadeSemestres) {
		this.nomeCurso = nomeCurso;
		this.quantidadeAluno = quantidadeAluno;
		this.quantidadeSemestres = quantidadeSemestres;
	}	
	
	// METODO
	public static Integer calculoTotalAlunos() {
		return null;
	}

	public static Integer calculoTotalAlunosAno() {
		return null;
	}
}