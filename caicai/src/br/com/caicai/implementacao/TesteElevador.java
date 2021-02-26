package br.com.caicai.implementacao;

import javax.swing.JOptionPane;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		elevador.configurar(
				Short.parseShort(JOptionPane.showInputDialog("Andar Max:")), 
				Short.parseShort(JOptionPane.showInputDialog("\nAndar Min")), 
				Byte.parseByte(JOptionPane.showInputDialog("\nCapacidade: "))
				);
		System.out.println(elevador.exibirResumo());
		elevador.subir();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
