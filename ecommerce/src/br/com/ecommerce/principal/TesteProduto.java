package br.com.ecommerce.principal;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setDescricao(JOptionPane.showInputDialog("Descricao: ").toUpperCase());
		p.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Qtde: ")));
		p.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Valor Compra:")));
		p.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Valor Venda: ")));
		p.setId(Integer.parseInt(JOptionPane.showInputDialog("Id: ")));;
		
		System.out.println(p.getResumo());
		
		
		System.out.println("Desconto" + p.getDesconto());
		p.ajustarValores(50);
		System.out.println("Valores ajustados");
		System.out.println(p.getResumo());
		System.out.println("Total Compra: " + p.getTotalCompra());
		System.out.println("Situa��o Estoque: " + p.verificarEstoque());

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
