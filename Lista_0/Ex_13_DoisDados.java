package Lista_0;

/*
Escreva uma classe que imprima todas as possibilidades de que no lançamento de dois dados
tenhamos o valor 7 como resultado da soma dos valores de cada dado.
 */

public class Ex_13_DoisDados {
    public static void main(String[] args){
        int contador = 1;

        for(int dado1 = 1; dado1 <= 6; dado1++){
            for(int dado2 = 1; dado2 <= 6; dado2++){
                if(dado1 + dado2 == 7){
                    System.out.println("Possibilidade " + contador + ": Dado1 = " + dado1 + ", Dado2 = " + dado2);
                    contador++;
                }
            }

        }

    }
}
