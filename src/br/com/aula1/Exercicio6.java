package br.com.aula1;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Escreve o raio do círculo: ");
		Double raio = Double.parseDouble(scan.next());
		Double raio2 = (raio * raio);
		Double area = (3.14 * raio2);
		System.out.println("A area do círculo é: " + area);
		scan.close();
	}
	
}
