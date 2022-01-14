package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product_03;

public class exercicio_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product_03 notas = new Product_03();
		System.out.println("Informe seu nome: ");
		notas.nome = sc.nextLine();
		System.out.println("Informe suas notas nos trimestres: ");
		notas.nota = sc.nextDouble();
		notas.nota2 = sc.nextDouble();
		notas.nota3 = sc.nextDouble();

		System.out.println(notas);

		sc.close();
	}

}
