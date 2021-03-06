package br.com.ecommerce.modelo;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String fone;
	
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, String email, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}

	public int Id() {
		return id;
	}
	
	public String nome() {
		return "Nome:";
	}
	
	public String email(){
		return "Usuario de e-mail: ";
		
	}
	public String fone() {
		return "Telefone: ";
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public String getAll() {
		return  "Id: " + id + "\n" +
				"Nome: " + nome + "\n" +
	           "E-mail: " + email + "\n" +
				"Telefone: " + fone;
	           
				 
	}
	
	public void setAll(int i, String n, String e, String tel) {
		id=i;
		nome=n;
		email=e;
		fone=tel;
		
	}
	public String getUsuario() {
		if(email.contains("@")) {
			return email.substring(0, email.indexOf("@"));
		}
		return email;
	}
}

	
	


