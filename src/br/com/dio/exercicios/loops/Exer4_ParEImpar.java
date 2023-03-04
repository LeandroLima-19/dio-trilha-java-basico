package br.com.dio.exercicios.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Exer4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scanner.nextInt();

        do {
            System.out.println("Números: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }
            count++;

        }while(count < quantNumeros);
        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números impares: " + quantImpares);
    }
}
