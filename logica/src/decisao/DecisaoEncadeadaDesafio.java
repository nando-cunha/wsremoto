package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeadaDesafio {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Informe o Produto: ");
		String tipo = JOptionPane.showInputDialog("Informe o Tipo (Eletr�nico ou Alimenticio): ").toUpperCase();
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade comprada: "));
		double valor_unit = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unit�rio do produto: "));
		
		if (qtd>100 && tipo.equals("ALIMENTICIO") )
		{
			double valor_com_imposto = valor_unit + 4.0;
			System.out.println("O valor unit�rio ser� de: " + valor_com_imposto + " r$");
		}
		else if (qtd<50 && tipo.equals("ALIMENTICIO"))
		{
			double valor_com_imposto = valor_unit + 5.0;
			System.out.println("O valor unit�rio ser� de: " + valor_com_imposto + " r$");
		}
		
		else if (qtd>100 && tipo.equals("ELETRONICO"))
		{
			double valor_com_imposto = valor_unit + 6.0;
			System.out.println("O valor unit�rio ser� de: " + valor_com_imposto + " r$");
		}
		else if (qtd<50 && tipo.equals("ELETRONICO"))
		{
			double valor_com_imposto = valor_unit + 7.0;
			System.out.println("O valor unit�rio ser� de: " + valor_com_imposto + " r$");
		}
		else if (qtd>=50 && qtd<=100)
		{
			if (tipo.equals("ALIMENTICIO"))
			{
			double valor_com_imposto = valor_unit + 4.5;
			System.out.println("O valor unit�rio ser� de: " + valor_com_imposto + " r$");	
			}
			if (tipo.equals("ELETRONICO"))
			{
			double valor_com_imposto = valor_unit + 6.5;
			System.out.println("O valor unit�rio ser� de: " + valor_com_imposto + " r$");		
			}
		}
		else
		{
		System.out.println("Categoria Inv�lida ou n�o cadastrada.");
		}
	}

}
