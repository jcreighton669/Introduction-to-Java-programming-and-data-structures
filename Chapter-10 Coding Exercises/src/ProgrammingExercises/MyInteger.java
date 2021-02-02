/** ************************************
 *            MyInteger                *
 *-------------------------------------*
 * +value: int                         *
 * +MyInteger(value: int)              *
 * +getValue(): int                    *
 * +isEven(): boolean                  *
 * +isOdd(): boolean                   *
 * +isPrime(): boolean                 *
 * +isEven(value: int): boolean        *
 * ----------------------------        *
 * +isOdd(value: int): boolean         *
 * ---------------------------         *
 * +isPrime(value: int): boolean       *
 * -----------------------------       *
 * +isEven(value: MyInteger): boolean  *
 * ----------------------------------  *
 * +isOdd(value: MyInteger): boolean   *
 * ---------------------------------   *
 * +isPrime(value: MyInteger): boolean *
 * ----------------------------------- *
 * +equals(value: int): boolean        *
 * +equals(value: MyInteger): boolean  *
 * +parseInt(chars: char[])            *
 * -----------------------             *
 * +parseInt(str: String)              *
 * ---------------------               *
 ************************************* */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class MyInteger {

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	/**
	 * Return value
	 *
	 * @return
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Return true if value is even
	 *
	 * @return
	 */
	public boolean isEven() {
		return isEven(value);
	}

	/**
	 * Return true if value is odd
	 *
	 * @return
	 */
	public boolean isOdd() {
		return isOdd(value);
	}

	/**
	 * Return true if value is prime
	 *
	 * @return
	 */
	public boolean isPrime() {
		return isPrime(value);
	}

	/**
	 * Return true if the specified value is even
	 *
	 * @param value
	 * @return
	 */
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	/**
	 * Return true if the specified value is odd
	 *
	 * @param value
	 * @return
	 */
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}

	/**
	 * Return true if the specified value is prime
	 *
	 * @param value
	 * @return
	 */
	public static boolean isPrime(int value) {
		for (int divisor = 2; divisor < value / 2; divisor++) {
			if (value % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Return true if the specified value is even
	 *
	 * @param myInteger
	 * @return
	 */
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}

	/**
	 * Return true if the specified value is odd
	 *
	 * @param myInteger
	 * @return
	 */
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}

	/**
	 * Return true if the specified value is prime
	 *
	 * @param myInteger
	 * @return
	 */
	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}

	/**
	 * Return true if the value in this object is equal to the specified value
	 *
	 * @param value
	 * @return
	 */
	public boolean equals(int value) {
		return this.value == value;
	}

	/**
	 * Return true if the value in this object is equal to the specified value
	 *
	 * @param myInteger
	 * @return
	 */
	public boolean equals(MyInteger myInteger) {
		return myInteger.value == this.value;
	}

	/**
	 * Converts an array of numeric characters to an int array
	 *
	 * @param chars
	 * @return
	 */
	public static int parseInt(char[] chars) {
		int value = 0;
		for (int i = 0, j = (int) Math.pow(10, chars.length - 1); i < chars.length; i++, j /= 10) {
			value += (chars[i] - 48) * j;
		}
		return value;
	}

	/**
	 * Converts a string into an int value
	 *
	 * @param str
	 * @return
	 */
	public static int parseInt(String str) {
		int value = 0;
		for (int i = 0, j = (int) Math.pow(10, str.length() - 1); i < str.length(); i++, j /= 10) {
			value += (str.charAt(i) - 48) * j;
		}
		return value;
	}
}
