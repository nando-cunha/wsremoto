package decisao;

import javax.swing.JOptionPane;

public class DecisaoCompostaDesafio {

	public static void main(String[] args) {
		
		String time1 = JOptionPane.showInputDialog("Informe o time da Casa: ");
		short placar_time1 = Short.parseShort(JOptionPane.showInputDialog("Informe quantos gols no jogo hoje: "));
		String time2 = JOptionPane.showInputDialog("Informe o time Visitante: ");
		short placar_time2 = Short.parseShort(JOptionPane.showInputDialog("Informe quantos gols no jogo hoje: "));
		if (placar_time1>placar_time2)
		{
			System.out.println("O Time da Casa venceu!");
		}
		else if (placar_time2>placar_time1)
		{
			System.out.println("O time visitante venceu!");
		}
		else
		{
			System.out.println("EMPATE !");
		}
			
	}

}
