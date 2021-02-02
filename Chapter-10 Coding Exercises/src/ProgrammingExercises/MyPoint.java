/** ********************************
 *            MyPoint              *
 *---------------------------------*
 * -x: double                      *
 * -y: double                      *
 * +MyPoint()                      *
 * +MyPoint(x: double, y: double)  *
 * +getX(): double                 *
 * +getY(): double                 *
 * +distance(myPoint: MyPoint)     *
 * +distance(x: double, y: double) *
 ********************************* */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class MyPoint {

	private double x;
	private double y;

	public MyPoint() {
		this(0, 0);
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Return x
	 *
	 * @return
	 */
	public double getX() {
		return x;
	}

	/**
	 * Return y
	 *
	 * @return
	 */
	public double getY() {
		return y;
	}

	/**
	 * Return the distance from this point to a specified point of the MyPoint type
	 *
	 * @param myPoint
	 * @return
	 */
	public double distance(MyPoint myPoint) {
		return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.y - y, 2));
	}

	/**
	 * Return the distance from this point to another point with specified x- and y- coordinates.
	 *
	 * @param x
	 * @param y
	 * @return
	 */
	public double distance(double x, double y) {
		return distance(new MyPoint(x, y));
	}
}
