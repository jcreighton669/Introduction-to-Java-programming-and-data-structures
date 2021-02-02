/** **************************
 *         StopWatch         *
 *---------------------------*
 * -startTime: long          *
 * -endTime: long            *
 * +StopWatch()              *
 * +start()                  *
 * +stop()                   *
 * +getElapsedTime(): long   *
 * +getStratTime(): long     *
 * +getEndTime(): long       *
 *************************** */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class StopWatch {

	private long startTime;
	private long endTime;

	public StopWatch() {
		startTime = System.currentTimeMillis();
	}

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return endTime - startTime;
	}

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		double[] nums = new double[100000];
		for (int i = 0; i < 100000; i++) {
			nums[i] = (Math.random() * 1000000);
		}

		StopWatch sw = new StopWatch();
		sw.start();
		selectionSort(nums);
		sw.stop();

		System.out.println(sw.getElapsedTime());
	}

	/**
	 * The method for sorting the numbers
	 *
	 * @param list
	 */
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i...list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
