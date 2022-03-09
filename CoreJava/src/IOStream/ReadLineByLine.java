package IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ReadLineByLine {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("F:\\Text File\\Rays.txt");
		BufferedReader br = new BufferedReader(reader);

		String line = br.readLine();

		while (line != null) {

			System.out.println(line);
			line = br.readLine();
		}
		reader.close();
	}

}
