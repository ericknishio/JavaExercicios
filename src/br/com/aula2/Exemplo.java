package br.com.aula2;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double num1 = Double.parseDouble(scan.next());
		System.out.println(num1);
		scan.close();
	}
}
