package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1Repeticao {

	public static void main(String[] args) {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
		while(dia==0 && dia >31)
		{
			System.out.println("Dia no formato errado!");
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
		}
		String mes = JOptionPane.showInputDialog("Digite o m�s").toLowerCase();
		while(mes.contains("janeiro"+"fevereiro"+"mar�o"+"maio"+"abril"+"junho"+"julho"+"agosto"+"setembro"+"outubro"+"novembro"+"dezembro")==true)
		{
			System.out.println("M�s inexistente");
			mes = JOptionPane.showInputDialog("Digite o m�s").toLowerCase();
		}
		 
		String ano = JOptionPane.showInputDialog("Digite o ano:").toLowerCase();
		while(ano.length()<4)
		{
			System.out.println("Ano incorreto! Digite no formato AAAA");
			ano = JOptionPane.showInputDialog("Digite o ano: ").toLowerCase();
		}
	System.out.println(dia + "/" + mes + "/" + ano);
		
		
	}

}
