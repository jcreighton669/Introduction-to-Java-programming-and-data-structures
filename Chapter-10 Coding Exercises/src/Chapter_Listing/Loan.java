/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listing;

/**
 *
 * @author Justin
 */
public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/**
	 * Default constructor
	 */
	public Loan() {
		this(2.5, 1, 1000);

	}

	/**
	 * Construct a loan with specified annual interest rate, number of years, and loan amount
	 *
	 * @param annualInterestRate
	 * @param numberOfYears
	 * @param loanAmount
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}

	/**
	 * Return annualInterestRate
	 *
	 * @return
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * Return numberOfYears
	 *
	 * @return
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/**
	 * Return loanAmount
	 *
	 * @return
	 */
	public double getLoanAmount() {
		return loanAmount;
	}

	/**
	 * Return loan date
	 *
	 * @return
	 */
	public java.util.Date getLoanDate() {
		return loanDate;
	}

	/**
	 * Set a new annualInterestRate
	 *
	 * @param annualInterestRate
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * Set a new numberOfYears
	 *
	 * @param numberOfYears
	 */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/**
	 * Set a new loanAmount
	 *
	 * @param loanAmount
	 */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * Find monthly payment
	 *
	 * @return
	 */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/**
	 * Find total payment
	 *
	 * @return
	 */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
}
