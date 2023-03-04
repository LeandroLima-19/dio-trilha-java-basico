package br.com.dio.exercicios.arrays;

import java.util.Arrays;

public class Exer1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {24, 19, 23, 30, 5, 1};
        int count = 0;

        System.out.print("Vetor: ");

        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor invertido: ");
        for (int i = (vetor.length-1); i >= 0 ; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}