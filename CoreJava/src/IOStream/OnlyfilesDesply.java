package IOStream;

import java.io.File;

public class OnlyfilesDesply {

	public static void main(String[] args) {

		File directory = new File("F:\\Text File");
		// File directory = new File(args[0]);

		String[] list = directory.list();
		
		for (int i = 0; i < list.length; i++) {

			File f1 = new File("F:\\Text File", list[i]);

			if (f1.isFile()) {

				System.out.println((i + 1) + " : " + list[i]);
			}

		}
	}

}
