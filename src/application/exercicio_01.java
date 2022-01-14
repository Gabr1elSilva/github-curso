package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product_01;

public class exercicio_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product_01 retangle = new Product_01();
		System.out.println("Enter rectangle width and height: ");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		System.out.println(retangle);
				
		sc.close();
	}

}
