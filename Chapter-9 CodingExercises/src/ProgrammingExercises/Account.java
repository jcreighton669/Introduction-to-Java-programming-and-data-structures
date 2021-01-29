/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Date;

/**
 *
 * @author Justin
 */
public class Account {

	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		return "Account{" + "id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + '}';
	}

	public static void main(String[] args) {
		Account acct = new Account(1122, 20000.00);
		Account.annualInterestRate = 4.5;

		System.out.println(acct.toString());

		System.out.println("Balance: " + acct.balance);
		acct.withdraw(2500);
		System.out.println("Balance: " + acct.balance);
		acct.deposit(3000);
		System.out.println(acct.toString());

	}
}
