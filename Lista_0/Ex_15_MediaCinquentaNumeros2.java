package Lista_0;
/*
Faça um programa que utilize a estrutura do while para ler 50 números e calcule
e exiba a média aritmética deles. (Pesquise sobre como realizar entrada de dados)
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_15_MediaCinquentaNumeros2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        final int MAX_VALUE = 50;

        do {
            System.out.println("Digite um número: ");
            try{
                Integer numero = Integer.parseInt(scanner.nextLine());
                numeros.add(numero);
            } catch (Exception e) {
                System.out.println("Número inválido, tente novamente.");
                continue;
            }

        } while (numeros.size() < MAX_VALUE);

        int soma = numeros.stream().mapToInt(i -> i).sum();
        double media = soma * 1.0 / numeros.size();

        System.out.println("Soma dos números: " + numeros.toString() + " = " + soma);
        System.out.println("Média aritimética: " + soma + " / " + numeros.size() + " = " + media);


    }
}
