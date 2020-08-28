package com.company;
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do cliente ");
		String holder = sc.nextLine();

		System.out.println("digite o numero da conta ");
		int number = sc.nextInt();
		double value =0;
		Bank bank4 = new Bank(holder, number, value);
		
		double value2 = 1;
		int afirm = 1;
		
		System.out.println("Digite se vai depositar y or n ");
		int decid = sc.nextInt();
		
		if (decid == afirm) {
			System.out.println("Digite o valor ");
			value2 = sc.nextDouble();
		}
		else {
			System.out.println("Sem saldo ");
		}
		value = value2;
		
		
		

		System.out.println("Adicionar um valor ");
		value = sc.nextDouble();
		bank4.addValue(value);

		System.out.println(bank4.getValue());

		System.out.println("Digite o valor para retirar ");
		value = sc.nextDouble();
		bank4.removeValue(value);

		System.out.println(bank4.getValue());
		System.out.println(bank4.toString());

		sc.close();

	}

}
