package Lista;

import java.util.Scanner;
import java.util.ArrayList;

public class ExecProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<produto> products = new ArrayList<produto>(5);
        int Tam = 5;
        for (int i = 0; i < Tam; i++) {
            produto prodObj = new produto();
            System.out.println("Digite o codigo do produto: ");
            prodObj.setCodProd(sc.nextInt());
            System.out.println("Informe o preço do produto: ");
            prodObj.setPreco(sc.nextDouble());
            System.out.println("Informe a quantidade de produto em estoque: ");
            prodObj.setQtdEstocada(sc.nextDouble());
            products.add(prodObj);
        }
        System.out.println("Informe o valor do desconto: ");
        int desconto = sc.nextInt();
        for (int j = 0; j < products.size(); j++) {
            products.get(j).setPreco(products.get(j).getPreco() - (products.get(j).getPreco()) * (desconto / 100f));
        }
        for (produto prod : products) {
            System.out.println("RELATORIO PRODUTOS -");
            System.out.println("CODIGO DO PRODUTO: " + prod.getCodProd());
            System.out.println("PREÇO DO PRODUTO(COM DESCONTO): " + prod.getPreco());
            if (prod.getQtdEstocada() > 500) {
                System.out.println("PRODUTO COM ESTOQUE SUPERIOR A 500: " + prod.getCodProd());
            }
        }
        sc.close();
    }
}