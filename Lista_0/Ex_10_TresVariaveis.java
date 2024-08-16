package Lista_0;

/*
Faça um programa com 3 variáveis do tipo inteiro (int) tal que a primeira tenha o valor de 6,
a segunda o valor 4 e a terceira receba o valor da divisão da primeira pela segunda.
Exiba o valor da terceira variável. Faça uma análise do resultado.

 */

public class Ex_10_TresVariaveis {
    public static void main(String[] args){
        int primeiraVar = 6;
        int segundaVar = 4;
        int terceiraVar = primeiraVar / segundaVar;

        /*
        Matemáticamente, 6 / 4 = 1.5;
        contudo, como o resultado está sendo CALCULADO por valores int (6 e 4)
        e o valor é aproximado para o menor inteiro próximo, no caso 1;

        caso quisessemos ter o valor da terceiraVar igual ao resultado DECIMAL matématico,
        seria necessário transformar um dos valores em pontos flutuantes (double ou float) e armazenar
        numa variavél do mesmo tipo de dado.

        Ex:
        double terceiraVar = 6 * 1.0 (conversão para double) / 4
         */


        System.out.println(terceiraVar);


    }

}
