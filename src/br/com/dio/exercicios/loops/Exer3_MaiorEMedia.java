package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Exer3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        double soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();
            count++;
            soma = soma + numero;

            if (numero > maior) maior = numero;

        } while (count < 5);
        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (soma/5));
    }
}
