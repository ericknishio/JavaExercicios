package br.com.aula1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		A que eu crio a classe scan dentro
		System.out.print("Insira um n�mero inteiro: ");
        Integer num = scan.nextInt();
//        A classe scanner � usada quando vou pedir pro cliente digitar. nextInt � o que esta fazendo a leitura do dado inserido
        System.out.print("O n�mero inserido �: " + num);
        scan.close();
        
//        Se colocar println pula linha se n�o, continua na frente
//        System.out.print("O n�mero inserido �: \n" + num);
	}

}
