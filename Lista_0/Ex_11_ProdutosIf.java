package Lista_0;

/*
Utilize a estrutura if para fazer um programa que retorne o nome de um
produto a partir do código do mesmo. Considere os seguintes códigos:

001 ? Parafuso;
002 ? Porca;
003 ? Prego;

Para qualquer outro código: XXX ? Diversos.

 */

import java.util.Scanner;

public class Ex_11_ProdutosIf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Produtos:\n 001 - Parafuso;\n 002 - Porca\n 003 - Prego\n Qualquer outro código: Diversos\n" );
        System.out.println("Digite o código do produto:");

        String input = scanner.nextLine();

        if (input.equals("001")) {
            System.out.println("Parafuso");
        } else if (input.equals("002")) {
            System.out.println("Porca");
        } else if (input.equals("003")) {
            System.out.println("Prego");
        } else {
            System.out.println("Diversos");
        }

    }
}
