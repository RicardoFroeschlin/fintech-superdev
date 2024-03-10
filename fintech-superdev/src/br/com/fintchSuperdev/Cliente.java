package br.com.fintchSuperdev;

public class Cliente {
	
	// Declaração de atributos
	private String nome;
	private String email;
	private String cpf;
	private String[] contas;
	
	
	// nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// email	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Cpf 
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// contas
	public String[] getContas() {
		return contas;
	}
	public void setContas(String[] contas) {
		this.contas = contas;
	}
	

	


}
