package br.com.concessionaria.modelo;

public class Carro {


	//sintaxe para os metodos
	//<modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>) {
	
	private float valor;
	private String cor;
	private boolean status;
	private short velocidadeAtual;
	private String modelo;
	
	public String retornarCor( ) {
		return cor;	
	}
	public void preencherCor(String param) {
		cor = param.toUpperCase();
	}
		
	public float retornarValor() {
		return valor;
	}
		
	public void preencherValor(float param) {
		if (param>0) {
		valor = param;
	}
	}	
	
	public void ligar() {
		status = true;
	}
		
	public void desligar() {
		status = false;
		velocidadeAtual = 0;
	
		
	}
	public void acelerar(short velocidade) {
		if (status==true) {
			velocidadeAtual = (short) (velocidadeAtual + velocidade);
		}
	}
		
	public void brecar(short velocidade) {
		if (status==true) {
			velocidadeAtual = (short) (velocidadeAtual - velocidade);
		}
	}
	
	public String retornarResumo() {
		String strstatus = "LIGADO";
		if (status==false) {
			strstatus="DESLIGADO";
		}
		return "Modelo: " + modelo + 
				"\nStatus: " + strstatus +
				"\nVelocidade: " + velocidadeAtual;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

