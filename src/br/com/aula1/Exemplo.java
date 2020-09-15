package br.com.aula1;

import javax.swing.JOptionPane;

public class Exemplo {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Insira o primeiro valor");
		Integer num1Int = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Insira o segundo valor");
		Integer num2Int = Integer.parseInt(num2);
		
		Integer num3 = num1Int + num2Int;
		
		JOptionPane.showMessageDialog(null, "Resultado: " + num3);
	}

}
