package IOStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyconCmnd {

	public static void main(String[] args) throws IOException {

		String target = "F:\\Text File\\Rays.txt";
		FileWriter writer = new FileWriter(target);
		PrintWriter printWriter = new PrintWriter(writer);

		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isReader);

		String line = br.readLine();

		while (!line.equals("quit")) {

			printWriter.print(line);
			line = br.readLine();

		}
		printWriter.close();
		isReader.close();
		
		System.out.println("Inserted");
	}
}
