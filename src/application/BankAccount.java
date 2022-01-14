package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.AccountModify;

public class BankAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountModify dados;

		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		String mInicial = sc.nextLine();
		if (mInicial.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			dados = new AccountModify(numberAccount, name, initialDeposit);
		} else {
			dados = new AccountModify(numberAccount, name);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(dados);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		dados.depositos(deposito);

		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(dados);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		dados.saques(saque);

		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(dados);

		sc.close();
	}

}
