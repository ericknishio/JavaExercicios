package br.com.aula7;

public class Aluno extends Matricula {

	// ATRIBUTOS
	private String nomeAluno;
	private Integer ano;
	private Integer semestre;
	private String curso;
	private String disciplina;

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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	// CONSTRUTORES
	public Aluno() {
		
	}
	
	public Aluno(String cpf, String rg, Integer numeroMatricula, Integer anoMatricula, Double mensalidade,
			String instituicao, String nomeAluno, Integer ano, Integer semestre, String curso, String disciplina) {
		this.setCpf(cpf);
		this.setRg(rg);
		this.setNumeroMatricula(numeroMatricula);
		this.setAnoMatricula(anoMatricula);
		this.setMensalidade(mensalidade);
		this.setInstituicao(instituicao);
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
