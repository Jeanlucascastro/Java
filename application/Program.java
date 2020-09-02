package application;



import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;




public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Empregados> list= new ArrayList<>();
		
		
		
		System.out.println("Quantos empregados são ? ");
		int n = sc.nextInt();
		
		for (int i =0; i<n; i++) {
			System.out.println("Qual o id do empregado ? ");
			
			int id = sc.nextInt();
			
			System.out.println("Digite o nome do funcionario  ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Digite o salario do funcionario ");
			double salary = sc.nextDouble();
			
			list.add(new Empregados(id, name, salary));
			
		}
		
	
		
		
		System.out.println("Qual empregado ganhar aumento ? ");
		int id = sc.nextInt();
		
		Empregados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		System.out.println("Digite a porcentagem a aumentar ");
		double cento = sc.nextDouble();
		emp.addSalary(cento);
		
		
		System.out.println("Lista e funcionarios ");
		System.out.println();

	
		for (Empregados x : list) {
			System.out.println(x);
		}
		
		
		
		
		
		

		sc.close();
	}

}
