package br.com.aula1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		A que eu crio a classe scan dentro
		System.out.print("Insira um número inteiro: ");
        Integer num = scan.nextInt();
//        A classe scanner é usada quando vou pedir pro cliente digitar. nextInt é o que esta fazendo a leitura do dado inserido
        System.out.print("O número inserido é: " + num);
        scan.close();
        
//        Se colocar println pula linha se não, continua na frente
//        System.out.print("O número inserido é: \n" + num);
	}

}
