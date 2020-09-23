package br.com.aula5;

import java.util.Scanner;

public class Exemplo {

	public static Double calculoAreaQuadrado(Double lado) {
		return lado * lado;
	}
	
	public static Double calculoAreaRetangulo(Double ladoA, Double ladoB) {
		return ladoA * ladoB;
	}
	
	public static Double calculoAreaCirculo(Double raio) {
		return raio * raio * Math.PI;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double ladoA;
		Double ladoB;
		Double raio;
		Double areaRetangulo;
		Double areaQuadrado;
		Double areaCirculo;
		String opcao;
		
		System.out.println("Menu de op��es:"
				+ "\n1 - Calcular �rea de quadrado"
				+ "\n2 - Calcular �rea de ret�ngulo"
				+ "\n3 - Calcular �rea de c�rculo");
		
		opcao = scan.next();
		
		switch(opcao) {
			case "1":
				System.out.print("Informe o lado do quadrado: ");
				ladoA = scan.nextDouble();
				areaQuadrado = calculoAreaQuadrado(ladoA);
				System.out.printf("�rea do quadrado: %.2f", areaQuadrado);
				break;
			case "2":
				System.out.print("Informe o lado A do ret�ngulo: ");
				ladoA = scan.nextDouble();
				System.out.print("Informe o lado B do ret�ngulo: ");
				ladoB = scan.nextDouble();
				areaRetangulo = calculoAreaRetangulo(ladoA, ladoB);
				System.out.printf("�rea do ret�ngulo: %.2f", areaRetangulo);
				break;
			case "3":
				System.out.print("Informe o raio do c�rculo: ");
				raio = scan.nextDouble();
				areaCirculo = calculoAreaCirculo(raio);
				System.out.printf("�rea do c�rculo: %.2f", areaCirculo);
				break;
			default:
				System.out.println("Op��o inv�lida");
				System.exit(0);
		}

	}

}
