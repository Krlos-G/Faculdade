package devops;

import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {
    private List<Cliente> clientes;

    public CadastroClientes() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void viewClientes() {
        for (Cliente cliente : this.clientes) {
            System.out.println(cliente.toString());
        }
    }

    public void attCliente(String nome, String novoEmail, String novoTelefone) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getNome().equals(nome)) {
                cliente.setEmail(novoEmail);
                cliente.setTelefone(novoTelefone);
                System.out.println("Cliente atualizado com sucesso!");
                return;
            }
        }
    }

    public void excluirCliente(String nome) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getNome().equals(nome)) {
                this.clientes.remove(cliente);
                System.out.println("Cliente excluido com sucesso!");
                return;
            } else {
                System.out.println("Cliente não encontrado!");
                return;
            }
        }
    }
}