package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String dia;
        System.out.println("Qual o numero do mes");
        x = sc.nextInt();

        dia = switch (x) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Feliz aniversario, este é o mes de abril";
            default -> "Vai procurar no calendario";
        };




            System.out.println("Este numero corresponde ao mes.. " + dia);
            sc.close();



    }




    }
