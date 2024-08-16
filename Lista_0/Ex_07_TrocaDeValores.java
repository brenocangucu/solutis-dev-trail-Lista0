package Lista_0;

/*Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma
que a variável A passe a possuir o valor da variável B e que a variável B passe
a possuir o valor da variável A. Apresentar os valores trocados
*/

import java.util.Scanner;

public class Ex_07_TrocaDeValores {
    public static void main(String[] args){
        String A;
        String B;
        String troca;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor para variável A: ");
        A = scanner.nextLine();

        System.out.println("Valor para variável B: ");
        B = scanner.nextLine();

        System.out.println("\nValores:\n" + "A: " + A + "\nB: " + B + "\n");

        // troca de valores
        troca = A;
        A = B;
        B = troca;

        System.out.println("Valores trocados:\n" + "A: " + A + "\nB: " + B);
    }
}
