package br.com.aula1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a altura do quadrado: ");
		Double altura = Double.parseDouble(scan.next());
		Double area = (altura * altura);
		System.out.print("Área do quadrado: " + area);
		Double dobro = (area * 2);
		System.out.print("\nDobro da area do quadrado: " + dobro);
		scan.close();
	}
	
}
