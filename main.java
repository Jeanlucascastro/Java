package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int total = one + two;
        int multi = two * two;
        double numero = 1.0;
        double soma = numero + two;
        System.out.println(total);
        System.out.println(one);
        System.out.println(two);
        System.out.println(multi);
        System.out.println(soma);
        String nome = "Rebeca";
        int idade = 6;
        System.out.println ("o nome " + nome + " e a idade e " + idade);
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        System.out.println(x);

        sc.close();

    }
}
