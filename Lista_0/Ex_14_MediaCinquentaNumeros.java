package Lista_0;

/*
Faça um programa que utilize a estrutura while para ler 50 números e calcule
e exiba a média aritmética deles. (Pesquise sobre como realizar entrada de dados)
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_14_MediaCinquentaNumeros {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        final int MAX_VALUE = 50;

        while(numeros.size() < MAX_VALUE){
            System.out.println("Digite um número: ");

            try{
                Integer numero = Integer.parseInt(scanner.nextLine());
                numeros.add(numero);
            }catch (Exception e) {
                System.out.println("Número inválido, tente novamente.");
                continue;
            }
        }

        int soma = numeros.stream().mapToInt(i -> i).sum();

        double media = soma * 1.0 / MAX_VALUE;

        System.out.println("Soma dos números: " + numeros.toString() + " = " + soma);
        System.out.println("Média aritimética: " + soma + " / " + numeros.size() + " = " + media);

    }
}
