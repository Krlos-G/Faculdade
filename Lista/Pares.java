package Lista;

import java.util.*;

public class Pares {
    public static void main(String[] args) {
        int Tam = 20;
        Random Fator = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>(Tam);
        ArrayList<Integer> impares = new ArrayList<Integer>(Tam);
        ArrayList<Integer> pares = new ArrayList<Integer>(Tam);

        for (int i = 0; i < 20; i++) {
            numbers.add(Fator.nextInt(50));
            if (numbers.get(i) % 2 == 0) {
                pares.add(numbers.get(i));
            } else {
                impares.add(numbers.get(i));
            }
        }
        System.out.println("A Lista em ordem crescente: ");
        Collections.sort(numbers);
        System.err.println(numbers);
        System.out.println("A lista em ordem decrescente: ");
        Collections.sort(numbers, Collections.reverseOrder());
        System.err.println(numbers);
        System.out.println("Lista com numeros pares: ");
        Collections.sort(pares);
        System.err.println(pares);
        System.out.println("Lista com numeros impares: ");
        Collections.sort(impares);
        System.err.println(impares);
    }
}
