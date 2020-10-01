package br.com.aula5;

public class Microbiologista extends Profissao {
	private boolean concursado;
	private String areaFormacao;
	
	public boolean isConcursado() {
		return concursado;
	}
	public void setConcursado(boolean concursado) {
		this.concursado = concursado;
	}
	public String getAreaFormacao() {
		return areaFormacao;
	}
	public void setAreaFormacao(String areaFormacao) {
		this.areaFormacao = areaFormacao;
	}
	public Microbiologista(boolean concursado, String areaFormacao) {
		super();
		this.concursado = concursado;
		this.areaFormacao = areaFormacao;
	}
		
	
	}


