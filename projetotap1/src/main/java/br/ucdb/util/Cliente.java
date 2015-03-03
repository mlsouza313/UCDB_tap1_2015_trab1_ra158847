package br.ucdb.util;

public class Cliente {

	public int id;
	public String sexo;
	public String nome; 
	public String rg;
	public String cpf;
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void cadastrar(int id2, String nome2, String rg2, String cpf2, String sexo2) {
		setId(id2);
		setNome(nome2);
		setRg(rg2);
		setCpf(cpf2);
		setSexo(sexo2);	
	}
	
}
