package com.company;


import entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.println("Quantas pessoas vão ao churrasco ");
        int n = sc.nextInt();

        for (int i =0; i <n; i++){
            System.out.println("Digite a ordem da pessoa ");
            int id = sc.nextInt();
            System.out.println("Digite o nome da pessoa ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite a quantidade de salgados que ela come ");
            int quantidade = sc.nextInt();

            list.add(new Pessoa(id, nome,quantidade));

        }

        for (Pessoa x : list){
            System.out.println(x);
        }



        sc.close();

    }

}
