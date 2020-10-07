package br.com.aula7;

import java.util.Scanner;

public class Aluno extends Matricula {
	 private String nomeAluno;
	 private Integer ano;
	 private Integer semestre;
	 private String curso;
	 private String disciplina;

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
	
	public Aluno(String cpf, String rg, Integer numeroMatricula, Integer anoMatricula, Double mensalidade,
			String instituicao, String nomeAluno, Integer ano, Integer semestre, String curso, String disciplina) {
		super(cpf, rg, numeroMatricula, anoMatricula, mensalidade, instituicao);
		this.nomeAluno = nomeAluno;
		this.ano = ano;
		this.semestre = semestre;
		this.curso = curso;
		this.disciplina = disciplina;
	} 
	
	public static Double calculoMedia() {
		return null;
	}
	public static Double calculoAprovado() {
		return null;
	}	
}

