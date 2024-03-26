package devops;

import java.util.Scanner;

public class ExecCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroClientes cadastro = new CadastroClientes();

        int opcion;
        do {
            System.out.println("\n===== Menu de Opções =====");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Visualizar Cliente");
            System.out.println("3. Atualizar Cliente");
            System.out.println("4. Excluir Cliente");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção:  ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    addCliente(cadastro, sc);
                    break;
                case 2:
                    cadastro.viewClientes();
                    break;
                case 3:
                    attCliente(cadastro, sc);
                    break;
                case 4:
                    excluirCliente(cadastro, sc);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcion != 5);
        sc.close();
    }

    public static void addCliente(CadastroClientes cadastro, Scanner sc) {
        System.out.println("\n===== Adicionar Cliente =====");
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.next();
        System.out.println("Digite o Email: ");
        String email = sc.next();
        System.out.println("Digite o Telefone: ");
        String telefone = sc.next();
        cadastro.addCliente(new Cliente(nome, email, telefone));
        System.out.println("Cliente adicionado com sucesso!");
    }

    public static void attCliente(CadastroClientes cadastro, Scanner sc) {
        System.out.println("\n===== Atualizar Cliente =====");
        System.out.println("Digite o nome do cliente a ser atualizado: ");
        String nome = sc.next();
        System.out.println("Digite o novo Email: ");
        String novoEmail = sc.next();
        System.out.println("Digite o novo Telefone: ");
        String novoTelefone = sc.next();
        cadastro.addCliente(new Cliente(nome, novoEmail, novoTelefone));
        System.out.println("Cliente atualizado com sucesso!");
    }

    public static void excluirCliente(CadastroClientes cadastro, Scanner sc) {
        System.out.println("\n===== Excluir Cliente =====");
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.next();
        cadastro.excluirCliente(nome);
        System.out.println("Cliente excluído com sucesso!");
    }
}
