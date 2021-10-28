package utils;

public class MathUtils {

	/**
	 * Retourne vrai si a < b
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean isLessThan(Number a, Number b) {
		return a.doubleValue() < b.doubleValue();
	}

	/**
	 * Retourne vrai si a > b
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean isGreaterThan(Number a, Number b) {
		return a.doubleValue() > b.doubleValue();
	}

	/**
	 * Retourne a - b
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	public static Number substract(Number a, Number b) {
		return a.doubleValue() - b.doubleValue();
	}

}
