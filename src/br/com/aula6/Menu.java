package br.com.aula6;

public class Menu {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String cadastras;
	String logar;
	String seLogado;
	String opcao;
	
	System.out.println("Menu de opções:"
			+ "\n1 - Cadastrar"
			+ "\n2 - Logar"
			+ "\n3 - Logado");
	
	opcao = scan.next();
	
	switch (opcao) {
		case "1":
			System.out.print("Cadastrar", cadastras);
			break;
		case "2";
			System.out.print("Logar", logar);
			break;
		case "3";
			System.out.print("Logado", Logado);	
			
		}
	}
}
	
	
		// MENU
		// CADASTRAR
		// LOGAR
		// SE LOGADO
			// EXIBIR INFORMAÇÕES DA CONTA
			// EDITAR CADASTRO
			// EXCLUIR CONTA
			// SAIR

	


