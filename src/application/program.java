package application;

import java.util.Locale;
import java.util.Scanner;
import entities.project;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		project product = new project();
		System.out.println("Entre com os valores do produto ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		
		
		
		
		sc.close();
		
		

	}

}
