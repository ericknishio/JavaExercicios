package br.com.aula5;

public class Profissao {
	private String areaAtuacao;
	private Integer anoExperiencia;
	private boolean primeiroEmprego;
	private boolean carteiraAssinada;
	private Integer horasTrabalhadas;
	private Double ganhoHora;
	
	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public Double getGanhoHora() {
		return ganhoHora;
	}
	public void setGanhoHora(Double ganhoHora) {
		this.ganhoHora = ganhoHora;
	}
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	public Integer getAnoExperiencia() {
		return anoExperiencia;
	}
	public void setAnoExperiencia(Integer anoExperiencia) {
		this.anoExperiencia = anoExperiencia;
	}
	public boolean isPrimeiroEmprego() {
		return primeiroEmprego;
	}
	public void setPrimeiroEmprego(boolean primeiroEmprego) {
		this.primeiroEmprego = primeiroEmprego;
	}
	public boolean isCarteiraAssinada() {
		return carteiraAssinada;
	}
	public void setCarteiraAssinada(boolean carteiraAssinada) {
		this.carteiraAssinada = carteiraAssinada;
	}
}
