package teste;

public class ClientePF extends Cliente{
	private String CPF;
	public ClientePF(String nome,String endereco,String CPF){
	    super(nome, endereco);
	    this.setCPF(CPF);

}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String toString() {
		return super.toString()+"CPF" + CPF;}
	}
	}
	
