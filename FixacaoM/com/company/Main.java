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
		System.out.println("Digite o valor a depositar ");
		double temp = sc.nextInt();
		double value = 0;
		if (temp > 0.0) {
			value = temp;
		} else {
			value = 0;

		}

		Bank bank = new Bank(holder, number, value);

		System.out.println("Adicionar um valor ?, Se sim, digite o valor abaixo, se não. Digite 0 ");
		value = sc.nextDouble();
		bank.addValue(value);

		System.out.println(bank.getValue());

		System.out.println("Digite o valor para retirar ");
		value = sc.nextDouble();
		bank.removeValue(value);

		System.out.println(bank.getValue());
		System.out.println(bank.toString());

		sc.close();

	}

}
