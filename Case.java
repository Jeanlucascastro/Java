
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

        switch (x) {

            case 1:
                dia = "Janeiro";
                break;
            case 2:
                dia = "Fevereiro";
                break;
            case 3:
                dia = "Março";
                break;
            case 4:
                dia = "Feliz aniversario, este é o mes de abril";
                break;
            default:
                dia = "Vai procurar no calendario";
                break;
        }




            System.out.println("Este numero corresponde ao mes.. " + dia);
            sc.close();



    }




    }

