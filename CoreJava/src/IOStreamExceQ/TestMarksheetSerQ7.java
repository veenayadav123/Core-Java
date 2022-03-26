package iOStreamExceQ;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestMarksheetSerQ7 {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("F:\\object7.ser");

		ObjectOutputStream out = new ObjectOutputStream(file);

		MarksheetQ7 ext = new MarksheetQ7();

		ext.setMessage("I am Indian");

		out.writeObject(ext);

		out.close();
		file.close();
		System.out.println("Done");

	}
}
