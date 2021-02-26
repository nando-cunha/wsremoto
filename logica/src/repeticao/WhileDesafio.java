package repeticao;

import javax.swing.JOptionPane;

public class WhileDesafio {

	public static void main(String[] args) {
		/*
		 *  Capturar nome e idade
		 *  Requisitos
		 *  -nome deve possuir no m�nimo 5 caracteres
		 *  -nome deve ter no m�ximo de 15 caracteres
		 *  -nome deve ter espaco.
		 *  -idade deve estar entre 18 e 70 anos.
		 */
		String nome = JOptionPane.showInputDialog("Informe seu nome completo: ");
		while (nome.length()<5 || nome.length()>15 || nome.contains(" ")==false) 
		{
			nome = JOptionPane.showInputDialog("Informe seu nome completo: ");
		}
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade: "));
		while (idade <18 || idade>=70)
		{
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe idade: "));
		}
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);
	}

}
