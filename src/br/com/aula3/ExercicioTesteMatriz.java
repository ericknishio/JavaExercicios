package br.com.aula3;

public class ExercicioTesteMatriz {

	public static void main(String[] args) {
		String matriz[][] = new String[2][2];
		matriz[0][0] = "A";
		matriz[0][1] = "B";
		matriz[1][0] = "C";
		matriz[1][1] = "D";
		for (int i = 0; i < 2; i++) {	
			for (int j = 0; j < 2; j++) {	
				System.out.println(matriz[i][j]);
			}			
		}
	}
}
