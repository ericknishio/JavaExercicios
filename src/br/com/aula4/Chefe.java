package br.com.aula4;

public class Chefe extends Funcionario {

	private Double bonificacao;
	private String setorResponsavel;
	
	public Double getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}
	public String getSetorResponsavel() {
		return setorResponsavel;
	}
	public void setSetorResponsavel(String setorResponsavel) {
		this.setorResponsavel = setorResponsavel;
	}
	
}
