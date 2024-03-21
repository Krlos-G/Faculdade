package Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class execFuncAtv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = 6;
        ArrayList<Funcionarioatv5> cadastro = new ArrayList<Funcionarioatv5>(tamanho);
        String[] nomeInicial = new String[tamanho];
        String letra;
        boolean encontrouFuncionario;
        System.out.println("Digite a inicial dos funcionários que deseja ver: ");
        letra = sc.next();
        String suffix = letra;
        for (int i = 0; i < tamanho; i++) {
            Funcionarioatv5 FuncionarioObj = new Funcionarioatv5();
            System.out.println("Digite o nome do " + (i + 1) + "º funcionário: ");
            FuncionarioObj.setNome(sc.next());
            System.out.println("Digite o salario bruto do " + (i + 1) + "º funcionario: ");
            FuncionarioObj.setSalarioBruto(sc.nextFloat());
            cadastro.add(FuncionarioObj);

            // salario com desconto do imposto
            if (cadastro.get(i).getSalarioBruto() < 850) {
                cadastro.get(i).setImposto(0);
            } else if (cadastro.get(i).getSalarioBruto() >= 850 && cadastro.get(i).getSalarioBruto() < 1200) {
                cadastro.get(i).setImposto(cadastro.get(i).getSalarioBruto() * 0.1f);
            } else if (cadastro.get(i).getSalarioBruto() >= 1200) {
                cadastro.get(i).setImposto(cadastro.get(i).getSalarioBruto() * 0.2f);
            } else if (cadastro.get(i).getSalarioBruto() < 0) {
                System.out.println("Erro!! Este salário não existe!");
            }

            // condição para saber se algum nome começa com a letra já sugerida
            if (cadastro.get(i).getNome().startsWith(suffix)) {
                nomeInicial[i] = cadastro.get(i).getNome();
                encontrouFuncionario = true;
            } else {
                System.err.println("Nenhum funcionário tem o nome com a letra fornecida!!");
            }
        }

        // o problema da mensagem se repetir sempre ja foi corrigido:)
        if (encontrouFuncionario = false) {
            System.err.println("Nenhum funcionário tem o nome com a letra fornecida!!");
        }

        for (Funcionarioatv5 f : cadastro) {
            System.out.println(f);
        }
        System.out.println(encontrouFuncionario);
        sc.close();
    }
}
