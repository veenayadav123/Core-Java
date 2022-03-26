package iOStreamExceQ;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFileQ3 {

	public static void main(String[] args) throws IOException {

		margFile("F:\\\\Text File\\\\abc.txt", "F:\\Text File\\xyz.txt");
	}

	public static void margFile(String s1, String s2) throws IOException {
		
		FileReader r1 = new FileReader(s1);

		FileReader r2 = new FileReader(s2);
		int c = r1.read();
		int d = r2.read();
		FileWriter w = new FileWriter("F:\\Text File\\veena.txt");
		PrintWriter pw = new PrintWriter(w);
		while (c != -1) {
			char ch = (char) c;
			pw.print(ch);
			System.out.print(ch);
			c = r1.read();
		}
		while (d != -1) {
			char ch = (char) d;
			pw.print(ch);
			System.out.print(ch);
			d = r2.read();
		}
		System.out.println("\nfile marge succesfuly");
		r1.close();
		r2.close();
		pw.close();
	}
}
