package iOStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Pattern;

public class Email {

	public static boolean isValid(String line) {

		String ar = "[\\w-]{1,100}@\\w{2,100}\\.\\w{2,8}$";

		Pattern p = Pattern.compile(ar);

		return p.matcher(line).matches();

	}

	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("F:\\Text File\\Rays.txt");

		BufferedReader br = new BufferedReader(file);

		String line = br.readLine();

		while (line != null) {

			if (isValid(line)) {

				System.out.println(line);
				line = br.readLine();

			} else {

				System.err.println(line);
				line = br.readLine();
			}
		}
	}
}
