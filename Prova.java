import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        int tam = 20;
        int elemento;
        int j = 1;
        Random fator = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(tam);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            numbers.add(fator.nextInt(100));
        }
        System.out.println("Lista de numeros: " + numbers);
        do {
            System.out.println("digite o elemento que deve ser removido da lista: ");
            elemento = sc.nextInt();
            boolean removido = numbers.remove(Integer.valueOf(elemento));
            if (removido) {
                System.out.println("Item removido da lista: " + elemento);
            } else {
                System.out.println("Item nao encontrado na lista: ");
            }
            System.out.println("Nova Lista: " + numbers);
            System.out.println("Para sair do Loop digite: -1\nPara continuar digite: 1");
            j = sc.nextInt();
        } while (j > 0);
        sc.close();
    }
}
