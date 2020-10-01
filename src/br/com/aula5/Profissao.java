package br.com.aula5;

public class Profissao implements DireitosTrabalhistas {
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
	
	public Profissao() {
	}
	
	
	public Profissao(String areaAtuacao, Integer anoExperiencia, boolean primeiroEmprego, boolean carteiraAssinada,
			Integer horasTrabalhadas, Double ganhoHora) {
		this.areaAtuacao = areaAtuacao;
		this.anoExperiencia = anoExperiencia;
		this.primeiroEmprego = primeiroEmprego;
		this.carteiraAssinada = carteiraAssinada;
		this.horasTrabalhadas = horasTrabalhadas;
		this.ganhoHora = ganhoHora;
	}
	
	@Override
	public Double calculoSalarial(Integer horasTrabalhadas, Double ganhoHora) {
		Double salario = horasTrabalhadas * ganhoHora;
		return salario;
	}
	@Override
	public Double calculFerias(Integer horasTrabalhadas) {
		Double diasTrabalhados = horasTrabalhadas / 8.0;
		Double diasFerias = diasTrabalhados / 12;
		return diasFerias;
	}
}
	