package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Exer5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabuada;

        System.out.println("Tabuada de: ");
        tabuada = scanner.nextInt();

        System.out.println("Tabuada do número: " + tabuada);

            for (int i = 1; i <= 10 ; i++) {
                System.out.println(tabuada + "X" + i + " = " + (tabuada*i));
            }
    }
}
