import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lista01Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        ArrayList<Integer> number = new ArrayList();

        for (i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + "º numero: ");
            number.add(sc.nextInt());
        }
        System.out.println("Percorrendo o ArrayList (usando o indice)");
        int tam = number.size();
        for (i = 0; i < tam; i++){
            System.out.printf("Posição %d: %s\n", i, number.get(i));
        }
        System.out.printf("\nInforme a posição a ser excluida:\n");
        i = sc.nextInt();
        try
        {
            number.remove(i);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.printf("\nPercorrendo o Arraylist (usando For-each)\n");
            i = 0;
            for (int  num : number) {
                System.out.printf("Posição %d: %s\n", i, num);
                i++;
            }
        }
    }    
}
