package br.com.generation.projetoJavaAmarelo;

public class Option2 {

	private String nome;
	private String email;
	private String telefone;
	
	public Option2(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		
		return "\n|Nome: " + this.nome + " | Telefone:" + this.telefone + " | E-mail:" + this.email;
	}
	
	
	
}
