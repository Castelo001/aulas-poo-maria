package teste;

public class Cliente {
	private String nome;
	private String endereco;

	public Cliente (String nome, String endereco){
	    
		this.setNome(nome);
	    this.setEndereco(endereco);
	}
	public String getEndereco(){
	    return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	public String getNome(){
	    return nome;
	}
	public void setNome(String nome) {
		this.nome =nome;
	}
	 public String toString() {
	return "Nome: "+nome+"\nEndereço: "+endereco;
}
}
