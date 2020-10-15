package br.com.aula7;

public class Aluno extends Matricula {
	// ATRIBUTOS
	 private String nomeAluno;
	 private Integer ano;
	 private Integer semestre;
	 private Curso curso;
	 private Disciplina disciplina;
	 
	// GET SET
	 public String getNomeAluno() {
			return nomeAluno;
		}

		public void setNomeAluno(String nomeAluno) {
			this.nomeAluno = nomeAluno;
		}

		public Integer getAno() {
			return ano;
		}

		public void setAno(Integer ano) {
			this.ano = ano;
		}

		public Integer getSemestre() {
			return semestre;
		}

		public void setSemestre(Integer semestre) {
			this.semestre = semestre;
		}

		public Curso getCurso() {
			return curso;
		}

		public void setCurso(Curso curso) {
			this.curso = curso;
		}

		public Disciplina getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}
	 
	// CONSTRUTORES
	public Aluno() {	
	}
	
	public Aluno(String nomeAluno, Integer ano, Integer semestre, Curso curso, Disciplina disciplina) {
		this.nomeAluno = nomeAluno;
		this.ano = ano;
		this.semestre = semestre;
		this.curso = curso;
		this.disciplina = disciplina;
	}

	// METODOS
	public static Double calculoMedia() {
		return null;
	}

	public static Double calculoAprovado() {
		return null;
	}
}
