package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome: ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Informe sua idade: "));
		
		if (idade==16 || idade==17 || idade>70)
		{
			System.out.println("Seu voto � facultativo.");
		}
		if (idade>=18 && idade<=70)
		{
			System.out.println("Seu voto � obrigat�rio.");
		}
		if (idade < 16)
		{
			System.out.println("Voc� ainda n�o pode votar.");
		}
		
		
		

	}

}
