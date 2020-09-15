package br.com.aula3;
//Criar uma matriz A 2x3 com elementos inteiros. Construir uma matriz B de mesmo tipo e tamanho
//e com os elementos da matriz A multiplicados por 2, ou seja: B[i] = A[i]*2

public class Exercicio2Matriz {

	public static void main(String[] args) {
		Integer matrizA[][] = new Integer[2][3];
		Integer matrizB[][] = new Integer [2][3];
		matrizA[0][0] = 1;
		matrizA[0][1] = 2;
		matrizA[0][2] = 3;
		matrizA[1][0] = 4;
		matrizA[1][1] = 5;
	    matrizA[1][2] = 6;
		for (int i = 0; i < 2; i++) {	
			for (int j = 0; j < 3; j++) {
				matrizB[i][j] = (matrizA[i][j]) * 2;
				System.out.println(matrizB[i][j]);
			}			
		}
	}
}


