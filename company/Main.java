package com.company;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            Student emp;
            emp = new Student();
            System.out.println("Digite o nome do Aluno ");
            emp.nomeDoAluno = sc.nextLine();
            System.out.println("Digite a primeira nota ");
            emp.primeiroSemestre = sc.nextDouble();
            System.out.println("Digite a segunda nota ");
            emp.segundoSemestre = sc.nextDouble();
            System.out.println("Digite a terceira nota ");
            emp.terceiroSemestre = sc.nextDouble();

            System.out.println("media final ");
            System.out.println(emp.mediaFinal());

            System.out.println(emp.result());










            sc.close();

        }

    }

}
