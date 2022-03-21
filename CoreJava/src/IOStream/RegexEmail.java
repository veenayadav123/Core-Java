package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RegexEmail {

	public static void main(String[] args) throws IOException {

		String source = "F:\\Text File\\Rays.txt";
		String target = "F:\\Text File\\Email.txt";

		FileReader r = new FileReader(source);

		Scanner sc = new Scanner(r);

		FileWriter writer = new FileWriter(target, true);
		PrintWriter pw = new PrintWriter(writer);

		String regex = "[\\w-]{1,100}@\\w{2,100}\\.\\w{2,8}$";

		System.out.println("The correct Email are succesfully sorted and pasted to the target folder.");

		while (sc.hasNextLine()) {

			String line = sc.nextLine();

			if (line.matches(regex)) {

				pw.println(line);
				System.out.println(line);

			} else {
				System.err.println(line);
			}
		}

		pw.close();
		writer.close();
		sc.close();
		r.close();
	}

}
