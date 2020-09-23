package br.com.aula4;
//Criar uma classe Periodico, e um objeto periodico com editora e endereço diferentes dos já cadastrados

public class Periodico extends Exemplar {
	private String qualisCapes; 
	private String area;
	
	public String getQualisCapes() {
		return qualisCapes;
	}
	public void setQualisCapes(String qualisCapes) {
		this.qualisCapes = qualisCapes;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	//Criar construtor sem argumentos e completo
}
