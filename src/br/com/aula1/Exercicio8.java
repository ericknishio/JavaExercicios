package br.com.aula1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora?: ");
		Double horas = Double.parseDouble(scan.next());
		System.out.print("Quantas horas trabalhadas no mês?: ");
		Double horas2 = Double.parseDouble(scan.next());
		Double salario = (horas * horas2);
		System.out.println("Salario do mês: " + salario);
		scan.close ();
	}
	
}
