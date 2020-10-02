package br.com.aula6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Cadastro {

	//REGRA DE CADASTRO
	public void CadastrarCliente(String cpf, String dataNascimento, String email, Integer idade, String nome, String rg, ESexo sexo, String telefone) {
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		cliente.setDataNascimento(dataNascimento);
		cliente.setEmail(email);
		cliente.setIdade(idade);
		cliente.setNome(nome);
		cliente.setRg(rg);
		cliente.setSexo(sexo);
		List<String> telefones = new ArrayList<>();
		telefones.add(telefone);
		cliente.setTelefones(telefones);
		
		
		HashMap<String, Cliente> clientes = new HashMap<>();
		clientes.put(cliente.getCpf(), cliente);
		UsuarioCadastrado usuarioCadastrado = new UsuarioCadastrado();
		usuarioCadastrado.setClientes(clientes);
	}
	
	public void CadastrarGerente(Gerente gerente) {
		
	}
	public String ExibirCliente() {
		Cliente cliente = new Cliente();
		String nome = cliente.getNome();
		return nome;
	}
}
