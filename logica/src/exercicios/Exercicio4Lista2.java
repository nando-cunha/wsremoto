package exercicios;

import javax.swing.JOptionPane;

public class Exercicio4Lista2 {

	public static void main(String[] args) {
		/*
		 * Escreva um c�digo que leia 3 valores inteiros diferentes e mostre em ordem descrescente.
		 */
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 3: "));
		
		if (valor1 < valor2 && valor2 < valor3)
		{
		System.out.println("Na ordem descrescente:" + valor3 + " "+ valor2 + " "+ valor1);
		}
		else if (valor1>valor2 && valor2<valor3)
		{
		System.out.println("Na ordem descrescente:" + valor3 + " "+ valor1 + " "+ valor2);	
		}
		else if (valor1>valor2 && valor2>valor3)
		{
		System.out.println("Na ordem descrescente:" + valor1 + " "+ valor2 + " "+ valor3);	
		}
		else if (valor2>valor1 && valor3>valor1) 
		{
		System.out.println("Na ordem descrescente:" + valor2 + " "+ valor3 + " "+ valor1);	
		}
		else if (valor2>valor1 && valor1>valor3) 
		{
		System.out.println("Na ordem descrescente:" + valor2 + " "+ valor1 + " "+ valor3);
		}
	}
}
