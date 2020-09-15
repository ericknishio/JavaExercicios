package br.com.aula3;
//Criar um vetor A com 8 elementos inteiros. Contruir um vetor B de mesmo tipo e tamanho
//e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i]*2

public class Exercicio2vetor {

	public static void main(String[] args) {
		Integer vetorA[] = new Integer[8];
		Integer vetorB[] = new Integer [8];
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		vetorA[5] = 6;
		vetorA[6] = 7;
		vetorA[7] = 8;
		vetorB[0] = vetorA[0];

		for (int i = 0; i < 8; i++) {
			vetorB[i] = vetorA[i]*2;
			System.out.println(vetorB[i]);
		}
	}
}


