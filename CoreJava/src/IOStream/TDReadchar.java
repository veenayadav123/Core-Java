package iOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TDReadchar {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("F:\\Text File\\Text1.txt");

		int ch = reader.read();
		char chr;

		while (ch != -1) {
			chr = (char) ch;
			System.out.print(chr);
			ch = reader.read();
		}
	}
}
