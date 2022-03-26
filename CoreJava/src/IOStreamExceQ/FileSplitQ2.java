package iOStreamExceQ;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSplitQ2 {
	
	public static void main(String[] args) throws IOException {

		split("F:\\Text File\\Rays.txt");
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

		FileWriter r2 = new FileWriter("F:\\Text File\\xyz.txt");

		FileReader R = new FileReader(s);
		int C = R.read();
		for (int i = 0; i < t; i++) {
			char ch = (char) C;
			if (i < t / 2) {
				r1.write(ch);
				System.out.print(ch);

			} else {
				r2.write(ch);
				System.out.print(ch);
			}
			C = R.read();
		}
		System.out.println("\nfile are spited");

		R.close();
		r1.close();
		r2.close();
	}
}
