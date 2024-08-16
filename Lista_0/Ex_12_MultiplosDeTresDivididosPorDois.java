package Lista_0;

/*
Imprima o resultado da divisão por 2 de todos os múltiplos de 3,
entre 1 e 100, usando os tipos de dados int e double .
 */
public class Ex_12_MultiplosDeTresDivididosPorDois {

    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                double divisao = i / 2.0 ;
                System.out.println("Número: " + i + ", dividido por 2 é igual a: " + divisao);
            }

        }

    }

}
