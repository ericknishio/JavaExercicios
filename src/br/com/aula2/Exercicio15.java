package br.com.aula2;

import java.util.Scanner;

//Exercicio 14: Faça um programa que lê duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, calcule e mostre sua média. 
// A distribuição de conceitos obedece a tabela abaixo:
// Conceito A = "Entre 9.0 e 10.0";
// Conceito B = "Entre 7.5 e 9.0";
// Conceito C = "Entre 6.0 e 7.5";
// Conceito D = "Entre 4.0 e 6.0";
// Conceito E = "Entre 4.0 e 0";
// O algoritmo deve mostrar na tela as notas, a media o conceito correspondente, e a mensagem "APROVADO" se for conceito A, B ou C. 
// E "REPROVADO" se for conceito  D ou E. 

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira a nota do primeiro bimestre: ");
		Double num1 = Double.parseDouble(scan.next());
		System.out.print("Insira a nota do segundo bimestre: ");
		Double num2 = Double.parseDouble(scan.next());
		Double soma = (num1 + num2);
		Double media = (soma / 2);
		System.out.print("valor da soma: " + soma);
		System.out.print("\nvalor da média: " + media);
		scan.close();
		if (media > 9.0) {
			System.out.print("\nConceito A");
		} else if ((media > 7.5) && (media <= 9.0)) {
			System.out.print("\nConceito B");
		} else if ((media > 6.0) && (media <= 7.5)) {
			System.out.print("\nConceito C");
		} else if ((media > 4.0) && (media <=6.0)) {
			System.out.print("\nConceito D");
		} else {
			System.out.print("\nConceito E");			
		}
		if (media >= 6.0) {
			System.out.println("\nAPROVADO");
		} else { 
			System.out.println("\nREPROVADO");
		}
	}
}

//Double num1 = Double.parseDouble(scan.next()); para converter uma string para double

