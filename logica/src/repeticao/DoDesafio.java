package repeticao;

import javax.swing.JOptionPane;

public class DoDesafio {

	public static void main(String[] args) {
		/*
		 * Jogador1 vai digitar um n�mero
		 * Jogador2 vai ter que adivinhar esse n�mero.
		 * s� pode receber a mensagem de parab�ns quando acertar.
		 * 
		 * Miss�o 2:
		 * Acrescentar dicas para o Jogador2 (numero maior ou menor)
		 * 
		 * 
		 * Miss�o 3:
		 * Acrescentar na mensagem de parab�ns a quantidade de tentativas.
		 * Dica: criar uma variavel para contar
		 */
		
		int jogador2 = 0;
		int cont = 0;
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 - informe um n�mero de 1 a 10: "));
		do
		{
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 - Qual n�mero ele digitou de 1 a 10?: "));
			if (jogador2 > jogador1)
			{
			System.out.println("Dica: N�mero digitado pelo jogador 1 � maior que: " + jogador2);
			}else if(jogador2 < jogador1)
			{
			System.out.println("Dica: N�mero digitado pelo jogador 1 � menor que: " + jogador2);
			}
			cont = cont + 1;
			
		}
		while(jogador2 != jogador1);
		System.out.println("Parab�ns voc� acertou o n�mero digitado pelo Jogador 1");
		System.out.println("N�mero de tentativas frustadas de acerto: " + cont);
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
