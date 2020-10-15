package br.com.aula7;

public class Matricula {

	// ATRIBUTOS
	private String cpf;
	private String rg;
	private Integer numeroMatricula;
	private Integer anoMatricula;
	private Double mensalidade;
	private String instituicao;

	// GET SET
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(Integer numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Integer getAnoMatricula() {
		return anoMatricula;
	}

	public void setAnoMatricula(Integer anoMatricula) {
		this.anoMatricula = anoMatricula;
	}

	public Double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	// CONSTRUTORES
	public Matricula() {
	}

	public Matricula(String cpf, String rg, Integer numeroMatricula, Integer anoMatricula, Double mensalidade,
			String instituicao) {
		this.cpf = cpf;
		this.rg = rg;
		this.numeroMatricula = numeroMatricula;
		this.anoMatricula = anoMatricula;
		this.mensalidade = mensalidade;
		this.instituicao = instituicao;
	}
}