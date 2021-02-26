package br.com.caicai.modelo;

public class Elevador {
	
	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private short andarAtual;
	private byte capacidadeMaxima;
	private byte qtdePessoas;
	
	
	public void configurar(short maximo, short minimo, byte capacidade) {
		andarMaximo=maximo;
		andarMinimo=minimo;
		capacidadeMaxima=capacidade;
		
	}
	
	public void preencherNome(String param) {
		nome = param.toUpperCase();
	}
	
	public String retornaNome() {
		return nome;
			
	}
	
	public void subir() {
		if(andarAtual<andarMaximo) {
			andarMaximo++;
		}
	}
	
	public void descer() {
		if(andarAtual>andarMinimo) {
			andarMinimo--;
		}
	}	
	public String sair(byte qtde) {
		if(qtdePessoas>=qtde) {
		   qtdePessoas-=qtde;
		   return "sa�da realizada";
		}
		return "Sa�da n�o realizada";
	}
	public String entrar(byte qtde) {
		byte total = (byte) (qtdePessoas + qtde);
		if((qtdePessoas+qtde)<=capacidadeMaxima){
			qtdePessoas+=qtde;
			return "Entrada realizada";
		}
		return "Entrada n�o realizada";
		
	}
		
	public void subir(byte andar) {
		if((andarAtual+andar)<=andarMaximo) {
			andarAtual=andar++;
		}
	}
	public String exibirResumo() {
		return "Andar atual: " + andarAtual + 
			   "\nQuantidade de pessoas: " + qtdePessoas +
			   "\nNome do elevador: " + nome;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
