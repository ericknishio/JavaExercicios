package br.com.aula2;

import java.util.Scanner;


// Exercicio 5: Fa�a um programa para a leitura de duas notas parciais de um aluno. 
// O programe deve calcular a media alcan�ada por aluno e apresentar: 
// A mensagem "APROVADO" se a m�dia alcansada por maior ou igual a sete;
// A mensagem "REPROVADO", se a m�dia for menor que sete;
// A mensagem "APROVADO COM DISTIN��O" se a m�dia for igual a dez.

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe nota1:");
		Integer num1 = scan.nextInt();
		System.out.print("Informe nota2:");
		Integer num2 = scan.nextInt();
		Integer soma = (num1+num2);
		Integer media = (soma / 2);
		System.out.println("A m�dia das notas �: " + media);
		if (media == 10) {
		System.out.print("Aprovado com distin��o");
	}   else if (media >= 7) {
		System.out.println("Aprovado");
	}   else {
			System.out.println("Reprovado");
	} scan.close();
		}
	}

