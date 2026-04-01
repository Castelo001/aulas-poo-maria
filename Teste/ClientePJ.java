package teste;

public class ClientePJ extends Cliente{
	private String CNPJ;
	public ClientePJ(String nome,String endereco,String CNPJ){
	    super(nome, endereco);
	    this.setCNPJ(CNPJ);
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
}
