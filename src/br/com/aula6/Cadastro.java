package br.com.aula6;

import java.util.HashMap;

public class Cadastro {

	//REGRA DE CADASTRO
	public void CadastrarCliente() {
		Cliente cliente = new Cliente();
		HashMap<String, Cliente> clientes = new HashMap<>();
		//clientes.put(cliente.getCpf(), cliente);
		UsuarioCadastrado uc1 = new UsuarioCadastrado();
		uc1.setClientes(clientes);
	}
	
	public void CadastrarGerente(Gerente gerente) {
		
	}

}
