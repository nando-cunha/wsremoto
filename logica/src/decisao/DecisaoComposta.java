package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String materia = JOptionPane.showInputDialog("Informe a mat�ria: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 2: "));
		float media = (nota1 + nota2)/2;
		if (media >=6)
		{
			System.out.println("PARAB�NS EST� APROVADO!");
		}
		else if (media<6)
		{
			System.out.println("VOC� FOI REPROVADO!");
		}
		System.out.println("Sua m�dia foi: " + media);
		
		
		
		
		
		
	}

}
