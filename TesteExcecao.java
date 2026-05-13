package error;

public class TesteExcecao {

	public static void main(String[] args) {
		int vetor[] = { 1, 2, 3, 4, 5};

		try {
			System.out.println("Vetor: " + vetor[6]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: Não exite esse valor no vetor");
		}

	}

}
