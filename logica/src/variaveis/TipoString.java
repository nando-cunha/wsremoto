package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "fernando-apArecido.cunha@itau-UnibaNco.com.br";
		
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtd de Caracteres: " + email.length());
		System.out.println("Tem arroba?: " + email.contains("@"));
		System.out.println("Posi��o do arroba: " + email.indexOf("@"));
		System.out.println("Exibir do 3� ao 5� caractere: " + email.substring(2,5));
		System.out.println("Exibir do 5� at� o fim: " + email.substring(4));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Segunda metade: " + email.substring(email.length()/2));
		System.out.println("Nome do usu�rio: " + email.toLowerCase().substring(0, email.indexOf("@")));
		System.out.println("Comparando primitivos: " + (8==9));
		System.out.println("Comparando primitivos: " + email.equals("fernando-apArecido.cunha@itau-UnibaNco.com.br"));
		
	}
	
	
	
	
	
}
