package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;
public class Programa {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Students emp = new Students();
	
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
	System.out.print(emp.toString());
	System.out.print(emp.toString());
	
	
	sc.close();
	

	}

}
