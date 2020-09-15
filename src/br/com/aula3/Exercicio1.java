package br.com.aula3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		String vetorA[] = new String[5];
		String vetorB[] = new String[5];
		vetorA[0] = "A";
		vetorA[1] = "B";
		vetorA[2] = "C";
		vetorA[3] = "D";
		vetorA[4] = "E";
		vetorB[0] = vetorA[0];

		for (int i = 0; i < 5; i++) {
			vetorB[i] = vetorA[i];
			System.out.println(vetorB[i]);
		}
	}
}


//prestar atenção no i para não entrar em lupi
// pode usar o for para copiar o vetorA para o vetorB;
