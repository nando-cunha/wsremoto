package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		String materia = JOptionPane.showInputDialog("Informe a matéria: ").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Informe o número de faltas nessa matéria: "));
		if (faltas >= 20)
		{
			System.out.println("Você está reprovado por falta !");
		}
		else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 1: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 2: "));
			float media = (nota1 + nota2)/2;
			if (media >=6)
			{
				System.out.println("PARABÉNS ESTÁ APROVADO!");
			}
			else if (media >=6)
			{
				System.out.println("Você foi aprovado, mas está de exame pelo número de faltas.");
			}
			else
			{
				System.out.println("Você está reprovado.");
			}
		}
		
		
		
		
	}

}
