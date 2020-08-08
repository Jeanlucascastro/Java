package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite quantas pessoas participarao");
            int n = sc.nextInt();
            int soma =0;

            System.out.println("Digite quantas cada");
            for (int i =0; i<n; i++){
                System.out.println("Digite quantos salgaos o proximo come");
                int x = sc.nextInt();

                soma = soma + x;


            }

        System.out.println("Sera necessario comprar " + soma + " salgados " );

            sc.close();

        }


    }




    }
