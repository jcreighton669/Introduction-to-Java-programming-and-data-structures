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
public class Tax {

	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;

	public Tax() {
		filingStatus = SINGLE_FILER;

		double[] currentYearRates = {15, 27.5, 30.5, 35.5, 39.1};
		setRates(currentYearRates);

		int[][] currentYearBrackets = {
			{27050, 65550, 136750, 297350},
			{45200, 109250, 166500, 297350},
			{22600, 54625, 83250, 148675},
			{36250, 93650, 151650, 297350}};
		setBrackets(currentYearBrackets);

		taxableIncome = 0;
	}

	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}

	/**
	 * Return filing status
	 *
	 * @return
	 */
	public int getFilingStatus() {
		return filingStatus;
	}

	/**
	 * Set new filing status
	 *
	 * @param filingStatus
	 */
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	/**
	 * Return brackets
	 *
	 * @return
	 */
	public int[][] getBrackets() {
		return brackets;
	}

	/**
	 * Set new brackets
	 *
	 * @param brackets
	 */
	public void setBrackets(int[][] brackets) {
		this.brackets = new int[brackets.length][brackets[0].length];
		for (int i = 0; i < brackets.length; i++) {
			for (int j = 0; j < brackets[i].length; j++) {
				this.brackets[i][j] = brackets[i][j];
			}
		}
	}

	/**
	 * Return tax rates
	 *
	 * @return
	 */
	public double[] getRates() {
		return rates;
	}

	/**
	 * Set new tax rates
	 *
	 * @param rates
	 */
	public void setRates(double[] rates) {
		this.rates = new double[rates.length];
		for (int i = 0; i < rates.length; i++) {
			this.rates[i] = rates[i] / 100;
		}
	}

	/**
	 * Return taxable income
	 *
	 * @return
	 */
	public double getTaxableIncome() {
		return taxableIncome;
	}

	/**
	 * Set taxable income
	 *
	 * @param taxableIncome
	 */
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	/**
	 * Return Tax
	 *
	 * @return
	 */
	public double getTax() {
		double tax = 0, incomeTaxed = 0;
		double income = taxableIncome;
		if (rates.length >= 2) {
			for (int i = rates.length - 2; i >= 0; i--) {
				if (income > brackets[filingStatus][i]) {
					tax += (incomeTaxed = income - brackets[filingStatus][i])
							* rates[i + 1];
					income -= incomeTaxed;
				}
			}
		}
		return tax += brackets[filingStatus][0] * rates[0];
	}

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Tax tax2001 = new Tax();
		Tax tax2009 = new Tax();

		double[] rates2001 = {15, 27.5, 30.5, 35.5, 39.1};
		tax2001.setRates(rates2001);

		int[][] brackets2001 = {
			{27050, 65550, 136750, 297350}, // Single filer
			{45200, 109250, 166500, 297350}, // Married jointly
			// -or qualifying widow(er)
			{22600, 54625, 83250, 148675}, // Married separately
			{36250, 93650, 151650, 297350} // Head of household
		};
		tax2001.setBrackets(brackets2001);

		final double FROM = 50000;
		final double TO = 60000;
		final double INTERVAL = 1000;

		System.out.println(
				"\n2001 tax tables for taxable income from $50,000 to $60,000");
		print(tax2001, FROM, TO, INTERVAL);

		System.out.println(
				"\n2009 tax tables for taxable income from $50,000 to $60,000");
		print(tax2009, FROM, TO, INTERVAL);
	}

	public static void print(Tax tax, double from, double to, double interval) {
		// Print header
		System.out.println(
				"---------------------------------------------------------------------\n"
				+ "Taxable       Single      Married Joint       Married        Head of\n"
				+ "Income                    or Qualifying       Separate       a House\n"
				+ "                          Widow(er)\n"
				+ "---------------------------------------------------------------------");
		// Print Data
		for (double taxableIncome = from;
				taxableIncome <= to; taxableIncome += interval) {
			tax.setTaxableIncome(taxableIncome);
			System.out.printf("%-13.0f", taxableIncome);
			tax.setFilingStatus(tax.SINGLE_FILER);
			System.out.printf("%8.2f", tax.getTax());
			tax.setFilingStatus(tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
			System.out.printf("%15.2f", tax.getTax());
			tax.setFilingStatus(tax.MARRIED_SEPARATELY);
			System.out.printf("%18.2f", tax.getTax());
			tax.setFilingStatus(tax.HEAD_OF_HOUSEHOLD);
			System.out.printf("%15.2f\n", tax.getTax());
		}
	}
}
