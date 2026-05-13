package error;

public class NotaNegativaException extends Exception {
	// herdando a exceção.
	public NotaNegativaException() {
		super("Erro: não existe nota negativa");
	}

}
