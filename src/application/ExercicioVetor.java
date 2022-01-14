package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.VetorExercicio;

public class ExercicioVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		VetorExercicio[] vect = new VetorExercicio[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int nQuarto = sc.nextInt();
			vect[nQuarto] = new VetorExercicio(name, email);
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		sc.close();
	}

}
