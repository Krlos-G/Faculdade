package Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>(8);
        double maior = 0;
        double media = 0;
        double usuario;
        double qtdAcimaDoUsuario = 0;
        String nomeDoMaior = "";
        System.out.println("Digite um salário para saber os superiores a este: ");
        usuario = sc.nextDouble();
        for (int i = 0; i < 8; i++) {
            Funcionario funcionarioObj = new Funcionario();
            System.out.println("Digite o nome do funcionário: ");
            funcionarioObj.setNome(sc.next());
            System.out.println("Digite o salário do funcionário: ");
            funcionarioObj.setSalario(sc.nextDouble());
            funcionarios.add(funcionarioObj);
            if (funcionarios.get(i).getSalario() > maior) {
                maior = funcionarios.get(i).getSalario();
                nomeDoMaior = funcionarios.get(i).getNome();
            }

            if (funcionarios.get(i).getSalario() > usuario) {
                qtdAcimaDoUsuario++;
            }

            media += funcionarios.get(i).getSalario();
        }

        System.out.println("O funcionário com maior salário é: " + nomeDoMaior + " com o salario de R$ " + maior);
        System.out.println("A média salarial de todos os funcionários juntos é: " + (media / 8));

        if (qtdAcimaDoUsuario == 0) {
            System.out.println("Nenhum funcionário recebe um salário maior que o fornecido.");
        } else {
            System.out
                    .println("A quantidade de funcionários com salário maior que o fornceido é: " + qtdAcimaDoUsuario);

        }
        sc.close();

    }

}
