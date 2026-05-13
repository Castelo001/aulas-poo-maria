package error;

public class Aluno {
	private double nota;
	private double trabalho;

	public Aluno(double nota, double trabalho) {
		this.setNota(nota);
		this.setTrabalho(trabalho);
	}

	// instanciando a class do erro
	public String validaNota() throws NotaNegativaException{
		if ((getNota()<0) || (getTrabalho()<0)) {
			throw new NotaNegativaException();
		} else {
			return "nota valida";
		}package error;

public class Aluno {
	private double nota;
	private double trabalho;

	public Aluno(double nota, double trabalho) {
		this.setNota(nota);
		this.setTrabalho(trabalho);
	}

	// instanciando a class do erro
	public String validaNota() throws NotaNegativaException{
		if ((getNota()<0) || (getTrabalho()<0)) {
			throw new NotaNegativaException();
		} else {
			return "nota valida";
		}
	}

	private double getTrabalho() {
		return trabalho;
	}

	private void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}

	private double getNota() {
		return nota;
	}

	private void setNota(double nota) {
		this.nota = nota;
	}

}

	}

	private double getTrabalho() {
		return trabalho;
	}

	private void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}

	private double getNota() {
		return nota;
	}

	private void setNota(double nota) {
		this.nota = nota;
	}

}
