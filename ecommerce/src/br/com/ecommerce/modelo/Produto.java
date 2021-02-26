package br.com.ecommerce.modelo;

public class Produto {
	
	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;
	
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public float getTotalCompra() {
		return  valorCompra * qtde;
		
	}
	
	public float getDesconto() {
		return valorVenda * (float) 0.09;
		
	}
	public String getResumo() {
		return "Descricao: " + descricao + "\n" +
				"Valor da venda: " + valorVenda + "\n" +
				"Quantidade comprada: " + qtde;
	}
	
	public void setAll(int i, String d, float vc, float vv, int q ) {
		id=i;
		descricao=d;
		valorCompra=vc;
		valorVenda=vc;
		qtde=q;
	}
	
	public String verificarEstoque() {
		if (qtde>10) {
			return "Estoque alto.";
		}
		else if (qtde<5) {
			return "Estoque baixo.";
		}
		return "Estoque médio.";
	}
	public void ajustarValores(float porcentagem) {
		valorVenda = valorVenda * (porcentagem/100);
		valorCompra = valorCompra * (porcentagem/100);
	}
	
	

}
	
	

