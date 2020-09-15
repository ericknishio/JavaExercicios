package br.com.aula1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Insira a nota do primeiro bimestre: ");
		Integer num1 = scan.nextInt();
		System.out.print("Insira a nota do segundo bimestre: ");
		Integer num2 = scan.nextInt();
		System.out.print("Insira a nota do terceiro bimestre: ");
		Integer num3 = scan.nextInt();
		System.out.print("Insira a nota do quarto bimestre: ");
		Integer num4 = scan.nextInt();
		Integer soma = (num1 + num2 + num3 + num4);
		Integer media = (soma / 4);
		System.out.print("valor da soma: " + soma);
		System.out.print("\nvalor da média: " + media);
		scan.close();
	}

}
