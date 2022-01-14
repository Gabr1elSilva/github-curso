package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvector;

public class PrecoDolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConvector preco = new CurrencyConvector();

		System.out.print("What is the dollar price? ");
		preco.dolar = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double quantidade = sc.nextDouble();

		double qDolar = CurrencyConvector.ConvectorDolar(quantidade);

		System.out.printf("Amount to be paid in reais = %.2f", qDolar);

		sc.close();
	}

}
