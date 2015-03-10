
public class Aluno {

	private String cpf;
	private String rg;
	private String sexo;
	private String estado;
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setAluno(String nome, String cpf, String rg, String sexo, String estado){
		setNome(nome);
		setCpf(cpf);
		setEstado(estado);
		setRg(rg);
		setSexo(sexo);
	}
	
}
