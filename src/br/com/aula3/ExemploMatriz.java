package br.com.aula3;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		int mat1[][] = new int[3][2]; //linha, coluna
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) { //linha
			for (int j = 0; j < 2; j++) { //coluna
				System.out.printf("Informe o valor da posição [%d, %d] da matriz: ", i, j);
				mat1[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("\n" + mat1[i][j]);
			}
		}
		
		int soma = 0;
		int menor = mat1[0][0];
		int maior = mat1[0][0];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				soma = soma + mat1[i][j];
				
				if (menor > mat1[i][j]) {
					menor = mat1[i][j];
				}
				
				if (maior < mat1[i][j]) {
					maior = mat1[i][j];
				}
			}
		}
		System.out.println("Soma: " + soma);
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);
		scan.close();
	}
}