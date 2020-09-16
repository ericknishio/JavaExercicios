package br.com.aula4;

public class Exemplar {
	private String titulo;
	private Integer paginas;
	private Editora editora;
	private Integer volume;
	private Integer ano;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
}
