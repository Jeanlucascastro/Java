package com.company;

public class Student {
    public String nomeDoAluno;
    public double primeiroSemestre;
    public double segundoSemestre;
    public double terceiroSemestre;

    public double mediaFinal() {
        return primeiroSemestre + segundoSemestre + terceiroSemestre / 2;

    }

    public double result() {

        if (mediaFinal() < 60.0) {
            System.out.println("Reprovada ");
            return 60 - mediaFinal();
        } else {
            System.out.println("Aprovada ");
            return 0;


        }
    }
}

