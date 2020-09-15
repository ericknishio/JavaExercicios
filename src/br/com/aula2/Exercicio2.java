package br.com.aula2;

import java.util.Scanner;

// Faça um programa que peça um valor e mostre na tela se é positivo ou negativo.

public class Exercicio2 {

	public static void main(String[] args) {
		
		Integer num1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o numero: ");
		num1 = scan.nextInt();
        
        if  (num1 > 0 ) {
        	System.out.println("Positivo");
        }
        else {
        	System.out.println("Negativo");
        }
        scan.close();
	}
}
