package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		int qtd_micro_itau = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de computadores no ITA�:"));
		float valor_med_micro = Float.parseFloat(JOptionPane.showInputDialog("Valor m�dio do Micro $: "));
		
		float total = valor_med_micro*qtd_micro_itau;
		float valor_medio_desconto = valor_med_micro * (float) 0.9; 
		
		System.out.println("Total de custo dos micros: " + total );
		System.out.println("Valor m�dio com 10% de desconto: " + valor_medio_desconto );
		
		
		
		
		
	}

}
