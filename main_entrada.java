package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x;
        int y;
        String z;
        y = sc.nextInt();
        z = sc.next();
        x = sc.nextDouble();
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);

        sc.close();

    }
}
