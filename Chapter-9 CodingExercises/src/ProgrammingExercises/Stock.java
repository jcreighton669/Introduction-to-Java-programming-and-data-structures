/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class Stock {

	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	public double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / currentPrice) * 100;
	}

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation");

		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;

		System.out.println("Price Change: " + stock.getChangePercent() + "%");
	}
}
