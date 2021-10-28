package utils;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import interfaces.HasValue;

public class EnumUtils {

	public static <E extends Enum<?> & HasValue<T>, T> List<T> getValuesFromEnums(Collection<E> enumClass) {
		return enumClass.stream().map(m -> m.getValue()).collect(Collectors.toList());
	}

	public static <T extends Enum<?> & HasValue<?>> T getEnumFromValue(Class<T> clazz, Object value) {
		final String stringValue = value.toString();

		String enumValue = null;
		if (clazz != null && stringValue != null) {
			for (final T enu : clazz.getEnumConstants()) {
				enumValue = enu.getValueAsString();

				if (stringValue.equals(enumValue)) {
					return enu;
				}
			}
		}

		return null;
	}

}
