package br.com.aula2;

import java.util.Scanner;

// Exercicio 10: Faça um programa que pergunte em que turno você estuda. Peça para digitar M - Matutino, V - Vespertino ou N - Noturno
// Imprima a mensagem "Bom dia!", "Boa tarde!", "Boa noite!" ou "Valor Invalido!" conforme o caso.


public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Em que turno você estuda? "
				+ "(Digite M para matutino; " 
				+ "V para vespertino "
				+ "ou N para noturno): ");
		String turno = scan.next();
		if (turno.equalsIgnoreCase("M")) {
			System.out.print("Bom dia!");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.print("Boa tarde!");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.print("Boa noite!");
		} else {
			System.out.print("Valor Invalido!!");	
		 }	
		scan.close();
	}	
}   
	


