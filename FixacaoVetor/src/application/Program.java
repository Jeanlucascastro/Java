package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quartos = 9;
		Rent[] vetor = new Rent[quartos];
		System.out.println("Quantos alunos vao alugar hoje ? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Qual quarto vai ficar ? ");
			int posicao = sc.nextInt();
			sc.nextLine();
			System.out.println("Qual o nome ? ");
			String nome = sc.nextLine();
			System.out.println("Qual e e-mail ? ");
			String email = sc.nextLine();
			vetor [posicao] = new Rent(nome, email);
		}
		
		System.out.println("Quartos alugados ");
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor [i] != null) {
				System.out.println(i);
			System.out.println(vetor[i].getNome());
			System.out.println(vetor[i].getEmail());
			
			
			
			}
		
		
		}
		
		
		
		sc.close();
	}

}
