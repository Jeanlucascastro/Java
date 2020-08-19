package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Entre com os dados do produto");
		System.out.println("Name");
		product.name = sc.nextLine();
		System.out.println("Preco");
		product.price = sc.nextDouble();
		System.out.println("Quantidade");
		product.quantity = sc.nextInt();
		
		System.out.println("Data");
		System.out.println(product);
		
		System.out.println("Entre com o numero de produtos para adicionar");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated Data");
		System.out.println(product);
		
		System.out.println("Entre quantos sairam");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated Data");
		System.out.println(product);
		
		
		
		
		
		sc.close();

	}

}
