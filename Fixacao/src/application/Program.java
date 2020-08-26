package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Bank emp = new Bank();

	System.out.println("Digite o nome do cara ");
	emp.holder = sc.nextLine();
	System.out.println("digite o numero da conta ");
	emp.number = sc.nextInt();
	
	
	System.out.println("Digite o valor a depositar ");
	double temp = sc.nextInt();
	
	if (temp > 0.0) {
		emp.value = temp;
	}
	else {
		emp.value = 0;
		
	}
	
	System.out.println(emp.value);
	
	System.out.println("Adicionar um valor, digite o valor abaixo ");
	double value = sc.nextDouble();
	emp.addValue(value);
	
	System.out.println(emp.value);
				
	System.out.println("Digite o valor para retirar ");
	value = sc.nextDouble();
	emp.removeValue(value);
	
				
	System.out.println(emp.value);			
				
				
				
	sc.close();

	}

}
