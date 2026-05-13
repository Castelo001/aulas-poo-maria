package error;

public class AlunoApp {

	public static void main(String[] args) {
Aluno aluno1 = new Aluno(0.1, 5.0);
try {
	String resultado = aluno1.validaNota();
}System.out.println(resultado);
	}catch(NotaNegativaException nne)// nome da excessão
	{
		System.out.println(nne.getMessage());// mensagem para exibir na tela
	}

}
