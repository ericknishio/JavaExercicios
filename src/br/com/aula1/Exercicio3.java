package br.com.aula1;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira um n�mero inteiro: \n");
		Integer num1 = scan.nextInt();
		System.out.print("Insira n�mero inteiro2: \n");
        Integer num2 = scan.nextInt();
        System.out.print("O valor da soma �: \n" + (num1+num2));
        scan.close();     
	}
	
}
