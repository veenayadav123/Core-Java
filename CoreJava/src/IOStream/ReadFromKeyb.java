package iOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyb {

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(new FileWriter("F:\\Text File\\Rays.txt"));

		InputStreamReader kb = new InputStreamReader(System.in);

		BufferedReader in = new BufferedReader(kb);
		
		System.out.println("Hello");

		String line = in.readLine();
		while (!line.equals("quit")) {

			System.out.println(line);
			line = in.readLine();
		}
		in.close();
		out.close();
		kb.close();
	}
}
