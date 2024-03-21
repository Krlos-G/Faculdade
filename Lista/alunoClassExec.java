package Lista;

import java.util.ArrayList;
import java.util.Scanner;

public class alunoClassExec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<alunoClass> alunos = new ArrayList<alunoClass>(5);
        for (int i = 0; i < 5; i++) {
            alunoClass alunoObj = new alunoClass();
            System.out.println("Digite o nome do aluno: ");
            alunoObj.setNome(sc.next());
            System.out.println("Digite a nota final do aluno: ");
            alunoObj.setNotaFinal(sc.nextDouble());
            alunos.add(alunoObj);
        }
        for (alunoClass aluno : alunos) {
            System.out.println("RELATORIO ALUNOS -");
            if (aluno.getNotaFinal() > 7) {
                System.out.println("NOME DO ALUNO APROVADO: " + aluno.getNome());
                System.out.println("NOTA FINAL DO ALUNO: " + aluno.getNotaFinal());
            } else {
                System.out.println("NOME DO ALUNO REPROVADO: " + aluno.getNome());
                System.out.println("NOTA FINAL DO ALUNO: " + aluno.getNotaFinal());
            }
        }
        sc.close();
    }
}
