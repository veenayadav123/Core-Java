package IOStreamExceQ;

import java.io.File;

public class OnlyFileQ1 {

	public static void main(String[] args) throws Exception {

		File directory = new File("F:\\Text File");

		File[] list = directory.listFiles();

		for (int i = 0; i < list.length; i++) {

			if (list[i].isFile()) {

				System.out.println((i + 1) + " : " + list[i].getName());

			}
		}
	}
}
