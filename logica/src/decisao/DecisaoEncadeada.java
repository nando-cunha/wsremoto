package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		String materia = JOptionPane.showInputDialog("Informe a mat�ria: ").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Informe o n�mero de faltas nessa mat�ria: "));
		if (faltas >= 20)
		{
			System.out.println("Voc� est� reprovado por falta !");
		}
		else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 1: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 2: "));
			float media = (nota1 + nota2)/2;
			if (media >=6)
			{
				System.out.println("PARAB�NS EST� APROVADO!");
			}
			else if (media >=6)
			{
				System.out.println("Voc� foi aprovado, mas est� de exame pelo n�mero de faltas.");
			}
			else
			{
				System.out.println("Voc� est� reprovado.");
			}
		}
		
		
		
		
	}

}
