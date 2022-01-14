package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product_02;

public class exercicio_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product_02 salary = new Product_02();
		System.out.println("Name: ");
		salary.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		salary.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		salary.tax = sc.nextDouble();

		System.out.println("Employee: " + salary);

		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		salary.IncreaseSalary(percentage);

		System.out.println("Updated data: " + salary);

		sc.close();
	}

}
