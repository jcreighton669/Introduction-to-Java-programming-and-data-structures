/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class ATM {

	/**
	 * Print the menu
	 *
	 * @param input
	 * @return
	 */
	public static int printMenu(Scanner input) {
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		return input.nextInt();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Account[] accounts = new Account[10];

		initialBalance(accounts);

		do {
			System.out.print("Enter an id: ");
			int id = input.nextInt();

			if (isValidID(id, accounts)) {
				int choice;
				do {
					choice = printMenu(input);
					if (isTransaction(choice)) {
						executeTransaction(choice, accounts, id, input);
					}
				} while (choice != 4);
			}

		} while (true);
	}

	/**
	 * Initialize accounts with balance of 100
	 *
	 * @param a
	 */
	public static void initialBalance(Account[] a) {
		int initialBalance = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = new Account(i, initialBalance);
		}
	}

	/**
	 * Return true if choice is a transaction
	 *
	 * @param choice
	 * @return
	 */
	public static boolean isTransaction(int choice) {
		return choice > 0 && choice < 4;
	}

	/**
	 * Return true if ID is valid
	 *
	 * @param id
	 * @param a
	 * @return
	 */
	public static boolean isValidID(int id, Account[] a) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getId()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Execute a Transaction
	 *
	 * @param c
	 * @param a
	 * @param id
	 * @param input
	 */
	public static void executeTransaction(
			int c, Account[] a, int id, Scanner input) {
		switch (c) {
			case 1: // Viewing the current balance
				System.out.println("The balance is " + a[id].getBalance());
				break;
			case 2: // Withdraw money
				System.out.print("Enter an amount to withdraw: ");
				a[id].withdraw(input.nextDouble());
				break;
			case 3: // Deposit money
				System.out.print("Enter an amount to deposit: ");
				a[id].deposit(input.nextDouble());
		}
	}
}
