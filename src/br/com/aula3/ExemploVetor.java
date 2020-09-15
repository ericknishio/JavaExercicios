package br.com.aula3;

import java.util.Random;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		int n = 5;
		Integer vetor1[] = new Integer[n];
		String vetor2[] = new String[n];
		Double vetor3[] = new Double[3];
		
//		vetor1[0] = 10;
//		vetor1[1] = 20;
//		vetor1[2] = 30;
//		vetor1[3] = 40;
//		vetor1[4] = 50;
//		
//		for (int i = 0; i < n; i++) {
//			System.out.println(vetor1[i]);
//		}
//		
//		vetor2[0] = "A";
//		vetor2[1] = "B";
//		vetor2[2] = "C";
//		vetor2[3] = "D";
//		vetor2[4] = "E";
//		
//		for (int i = 4; i > -1; i--) {
//			System.out.println(vetor2[i]);
//		}
		
//		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < n; i++) {
//			System.out.printf("Informe o %do. valor do vetor de %d posições: ", (i+1), n);
//			vetor1[i] = scan.nextInt();
//		}
//		
//		for (int i = 0; i < n; i++) {
//			System.out.printf("Valor %d: %d\n", (i), vetor1[i]);
//		}
//		
//		int soma = 0;
//		int menor = vetor1[0]; //1
//		int maior = vetor1[0]; //54
//		
//		for (int i = 0; i < n; i++) {
//			soma = soma + vetor1[i];
//			
//			if (menor > vetor1[i]) {
//				menor = vetor1[i];
//			}
//			
//			if (maior < vetor1[i]) {
//				maior = vetor1[i];
//			}
//		}
//		System.out.print("\nSoma: " + soma);
//		System.out.print("\nMenor: " + menor);
//		System.out.print("\nMaior: " + maior);
//		scan.close();
		
		Random gerador = new Random();
		for (int i = 0; i < n; i++) {
			vetor1[i] = gerador.nextInt(10);
			System.out.println(vetor1[i]);
		}
	}
}
