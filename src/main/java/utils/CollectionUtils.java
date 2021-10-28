package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionUtils {

	public static boolean collectionNotNullOrEmpty(Collection<?> collection) {
		return collection != null && !collection.isEmpty();
	}

	public static boolean mapNotNullOrEmpty(Map<?, ?> map) {
		return map != null && !map.isEmpty();
	}

	public static <T> boolean arrayNotNullOrEmpty(T[] array) {
		return array != null && array.length > 0;
	}

	public static String[] toArrayString(Collection<?> collection) {
		String[] res = null;

		if (collection != null) {
			final int size = collection.size();
			res = new String[size];

			final Iterator<?> iter = collection.iterator();
			int index = 0;
			while (iter.hasNext()) {
				res[index] = String.valueOf(iter.next());
				index++;
			}
		}

		return res;
	}

	public static Object[] toSubArray(Object[] obj, int fromIndex, int toIndex) {
		Object[] res = null;

		if (obj != null && obj.length != 0) {
			res = new Object[toIndex - fromIndex + 1];
			int j = 0;

			for (int i = 0; i < obj.length; i++) {
				if (i >= fromIndex && i <= toIndex) {
					res[j] = obj[i];
					j++;
				}
			}
		}

		return res;
	}

	public static <T> List<T> toSubList(List<T> list, int fromIndex, int toIndex) {
		return list != null ? list.subList(fromIndex, toIndex) : new ArrayList<>();
	}

	@SafeVarargs
	public static <T> List<T> asList(T... items) {
		return new ArrayList<>(Arrays.asList(items));
	}

	public static <T> void fill(List<T> list, int index) {
		if (list == null) {
			list = new ArrayList<>();
		}

		final int startIndex = list.isEmpty() ? 0 : list.size() - 1;
		for (int i = startIndex; i <= index; i++) {
			list.add(null);
		}
	}

}
