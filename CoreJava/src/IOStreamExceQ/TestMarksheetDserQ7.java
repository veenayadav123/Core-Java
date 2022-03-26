package iOStreamExceQ;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class TestMarksheetDserQ7 {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("F:\\object7.ser");

		ObjectInputStream in = new ObjectInputStream(file);

		MarksheetQ7 ext = (MarksheetQ7) in.readObject();

		System.out.println("Custom message  :" + ext.getMessage());

		in.close();
		file.close();
	}

}
