package iOStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

	public class MergeFile {
	
	public static void main(String[] args) throws IOException {
		 //split("F:\\Text File\\Rays.txt");
		margFile("F:\\\\Text File\\\\abc.txt", "F:\\Text File\\xyz.txt");
	}

	public static void split(String s) throws IOException {
		int t = 0;
		FileReader r = new FileReader(s);
		int c = r.read();
		while (c != -1) {
			t++;
			char ch = (char) c;
			System.out.print(ch);
			c = r.read();
		}
		r.close();
		System.out.println("\ntoteleliment" + t);

		FileWriter r1 = new FileWriter("F:\\Text File\\abc.txt");
		// PrintWriter pw = new PrintWriter(r1);

		FileWriter r2 = new FileWriter("F:\\Text File\\xyz.txt");
		// PrintWriter pw2 = new PrintWriter(r2);
		FileReader R = new FileReader(s);
		int C = R.read();
		for (int i = 0; i < t; i++) {
			char ch = (char) C;
			if (i < t / 2) {
				r1.write(ch); // pw.print(ch);
				System.out.print(ch);

			} else {
				r2.write(ch); // pw2.print(ch);
				System.out.print(ch);
			}
			C = R.read();
		}
		System.out.println("\nfile are spited");

		R.close();
		r1.close();
		r2.close();

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




