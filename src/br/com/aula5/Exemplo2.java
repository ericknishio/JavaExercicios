package br.com.aula5;

public class Exemplo2 {
	
	public static void main(String[] args) {
		Heloisa helo = new Heloisa();
		helo = new Heloisa("Denis Souza",
				"Heloisa Martins",
				26,
				1.62,
				"Feminino",
				"Brasileira");
		
		String msgComer = helo.comer(2000.0);
		String msgDormir = helo.dormir(6);
		
		System.out.println(msgComer);
		System.out.println(msgDormir);
		
	}
}
