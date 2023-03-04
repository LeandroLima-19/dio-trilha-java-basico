package br.com.dio.exercicios.loops;

import java.util.Scanner;
public class Exer1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;

        while (true) {

            System.out.println("Nome: ");
            nome = scanner.next();

            if (nome.equals("0")) {
                break;
            }

            sobrenome = scanner.next();

            System.out.println("Idade: ");
            idade = scanner.nextInt();

            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
        }
    }
}
