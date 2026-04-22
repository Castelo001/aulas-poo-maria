package teste;

//import java.util.Scanner;

public class ClienteApp {
//POLIMORFISMO  22/04
	public static void main(String[] args) {
		/*
		 * Scanner entrada = new Scanner(System.in);
		 * 
		 * System.out.println("Digite o nome do Cliente Pessoa Jurídica : "); String
		 * nome = entrada.nextLine();
		 * System.out.println("Dpublic String toString() {
		return super.toString()+"CPF" + CPF;}
	}igite o endereço do Cliente Pessoa Jurídica : "); String
		 * endereco = entrada.nextLine();
		 * System.out.println("Digite o CNPJ do Cliente Pessoa Jurídica : "); String
		 * CNPJ = entrada.nextLine();
		 * 
		 * System.out.println("Digite o nome do Cliente Pessoa Física : "); String
		 * nomePF = entrada.nextLine();
		 * System.out.println("Digite o endereço do Cliente Pessoa Física : "); String
		 * enderecoPF = entrada.nextLine();
		 * System.out.println("Digite o CPF do Cliente Pessoa Física : "); String CPF =
		 * entrada.nextLine();
		 */

		ClientePJ ClientePJ1 = new ClientePJ("Duda", "Rua 1", "123456\n");
		ClientePF ClientePF1 = new ClientePF("Erika", "Rua 3", "6519845");

		System.out.println(ClientePJ1.toString());
		System.out.println(ClientePF1.toString());
		/*
		 * System.out.println("O nome do Cliente PJ1 é : " + ClientePJ1.getNome());
		 * System.out.println("O endereco do Cliente PJ1 é : " +
		 * ClientePJ1.getEndereco()); System.out.println("O CNPJ do Cliente PJ1 é : " +
		 * ClientePJ1.getCNPJ());
		 * 
		 * System.out.println("O nome do Cliente PF1 é : " + ClientePF1.getNome());
		 * System.out.println("O endereco do Cliente PF1 é : " +
		 * ClientePF1.getEndereco()); System.out.println("O CPF do Cliente PF1 é : " +
		 * ClientePF1.getCPF());
		 */

		//entrada.close();
	}
}
