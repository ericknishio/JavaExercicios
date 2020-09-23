package br.com.aula5;

public class Pessoa implements FuncoesBiologias {
	
	private String nome;
	private Integer idade;
	private Double altura;
	private String sexo;
	private String nacionalidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, Integer idade, Double altura, String sexo, String nacionalidade) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
	}
	
	@Override
	public String comer(Double calorias) {
		String mensagem;
		if (calorias < 2000) {
			mensagem = "Quantidade de calorias insuficientes.";
		} else if (calorias > 3000) {
			mensagem = "Quantidade de calorias excessivas.";
		} else {
			mensagem = "Quantidade de calorias suficientes.";
		}
		return mensagem;
	}
	
	@Override
	public String comer(Double caloriasIngeridas, Double caloriasGastas) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String dormir(Integer horas) {
		String mensagem;
		if (horas < 8) {
			mensagem = "Quantidade de horas de sono insuficientes.";
		} else if (horas > 9) {
			mensagem = "Quantidade de horas de sono excessivas.";
		} else {
			mensagem = "Quantidade de horas de sono suficientes.";
		}
		return mensagem;
	}

}
