package com.hardware_software_support.usecases;

import java.util.Scanner;
import com.hardware_software_support.exceptions.ComplaintException;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Online Hardware Software Support System.");
		System.out.println("=====================================================");
		System.out.println("Enter 1 if you are the H.O.D.");
		System.out.println("Enter 2 if you are an employee.");
		System.out.println("Enter 3 if you are a system engineer.");
		System.out.println("Enter 4 to exit");

		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();

		System.out.println("================================");

		switch (choice) {
			// H.O.D Case
			case 1:
				System.out.println("H.O.D");
				System.out.println("=============================");
				HodLoginUsecase login = new HodLoginUsecase();
				login.useLoginHod();

				while (true) {
					System.out.println("Enter 1 to register a new Engineer.");
					System.out.println("Enter 2 to see the list of all registered engineers.");
					System.out.println("Enter 3 to delete any Engineer.");
					System.out.println("Enter 4 to see all raised complaints");
					System.out.println("Enter 5 to assign a complaint to an engineer.");
					System.out.println("Enter 6 to logout");

					int hodChoice = sc.nextInt();
					System.out.println("===================================");

				}
		}
	}
}