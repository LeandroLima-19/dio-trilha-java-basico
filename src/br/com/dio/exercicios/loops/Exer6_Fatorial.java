package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Exer6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1;

        System.out.println("Fatorial: ");
        fatorial = scanner.nextInt();

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println("Fatorial de " + fatorial + " = " + multiplicacao);
    }
}
