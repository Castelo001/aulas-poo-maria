package bancoPooCliente;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO();
        dao.criarTabelaSeNaoExistir(); // garante que a tabela exista
        Scanner sc = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 5) {
            System.out.println("\n=== CRUD de Clientes ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Atualizar cliente");
            System.out.println("4 - Excluir cliente");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite um número de 1 a 5.");
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    Cliente c = new Cliente(nome, email, telefone);
                    dao.inserir(c);
                }
                case 2 -> {
                    List<Cliente> lista = dao.listar();
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        System.out.println("\n-- Clientes --");
                        lista.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    System.out.print("ID do cliente a atualizar: ");
                    int id;
                    try {
                        id = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("ID inválido."); break;
                    }
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = sc.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTel = sc.nextLine();
                    Cliente up = new Cliente(novoNome, novoEmail, novoTel);
                    up.setId(id);
                    dao.atualizar(up);
                }
                case 4 -> {
                    System.out.print("ID do cliente a excluir: ");
                    int idDel;
                    try {
                        idDel = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("ID inválido."); break;
                    }
                    dao.deletar(idDel);
                }
                case 5 -> System.out.println("Saindo..."); 
                default -> System.out.println("Opção inválida.");
            }
        }

        sc.close();
        System.out.println("Programa encerrado.");
    }
}