package br.com.aula1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Escreve o valor em metro: ");
		Integer num1 = scan.nextInt(); 
		Integer conversao = (num1 * 100);
		scan.close();
		System.out.print("Valor em centimetros: " + conversao);
	} 
	
}
