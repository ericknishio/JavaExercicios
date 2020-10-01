package br.com.aula6;

import java.util.HashMap;

public class UsuarioCadastrado {
	private HashMap<String, Cliente> clientes = new HashMap<>();
	private HashMap<String, Gerente> gerentes = new HashMap<>();
	
	public HashMap<String, Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(HashMap<String, Cliente> clientes) {
		this.clientes = clientes;
	}
	public HashMap<String, Gerente> getGerentes() {
		return gerentes;
	}
	public void setGerentes(HashMap<String, Gerente> gerentes) {
		this.gerentes = gerentes;
	}
}
