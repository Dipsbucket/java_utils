package utils;

public class CastUtils {

	@SuppressWarnings(value = { "unchecked" })
	public static <T> T uncheckedCast(Object object) {
		return object != null ? (T) object : null;
	}

}
