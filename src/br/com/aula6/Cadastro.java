package br.com.aula6;

import java.util.HashMap;

public class Cadastro {

	//REGRA DE CADASTRO
	public void CadastrarCliente(String cpf, String dataNascimento, String email, Integer idade, String nome, String rg, ESexo sexo, String telefone) {
		Cliente cliente = new Cliente();
//		cliente.setCpf(cpf);
//		cliente.setDataNascimento(dataNascimento);
//		cliente.setEmail(email);
//		cliente.setIdade(idade);
//		cliente.setNome(nome);
//		cliente.setRg(rg);
//		cliente.setSexo(sexo);
//		cliente.setTelefones(telefones);
		
		HashMap<String, Cliente> clientes = new HashMap<>();
		clientes.put(cliente.getCpf(), cliente);
		UsuarioCadastrado usuarioCadastrado = new UsuarioCadastrado();
		usuarioCadastrado.setClientes(clientes);
	}
	
	public void CadastrarGerente(Gerente gerente) {
		
	}

}
