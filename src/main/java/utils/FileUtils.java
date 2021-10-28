package utils;

import java.io.File;

public class FileUtils {

	public static void createDirectoryIfNotExists(String filePath) {
		try {
			final File dir = new File(filePath);
			if (!dir.exists()) {
				dir.mkdirs();
			}
		} catch (final Exception e) {
			throw new RuntimeException();
		}
	}

	public static void createFileIfNotExists(String filePath) {
		try {
			final File file = new File(filePath);
			file.createNewFile();
		} catch (final Exception e) {
			throw new RuntimeException();
		}
	}

}
