package iOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BDAppendimage {

	public static void main(String[] args) throws Exception {

		String source = "F:\\Text File\\IMG_20170826_132508.jpg";
		String target = "F:\\Text File\\IMG_2022_11.jpg";

		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);

		int ch = reader.read();
		while (ch != -1) {
			writer.write(ch);
			ch = reader.read();

		}
		writer.close();
		reader.close();
		System.out.println(source + " is copied to " + target);
	}

}
