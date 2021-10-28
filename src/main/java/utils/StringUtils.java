package utils;

public class StringUtils {

	public static boolean stringNotNullOrEmpty(String value) {
		return value != null && !value.isEmpty();
	}

	public static String[] splitAsArray(String value, String separator) {
		if (stringNotNullOrEmpty(value) && stringNotNullOrEmpty(separator)) {
			return value.split(separator);
		}

		return null;
	}

}
