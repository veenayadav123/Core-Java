package iOStreamExceQ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import iOStream.MarksheetBean;

public class TestQ6 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream file = new FileOutputStream("F:\\obj1.ser");

		ObjectOutputStream out = new ObjectOutputStream(file);

		Q6 m = new Q6();

		m.setName("Disha");
		m.setAge(21);
		m.setAddress("Indore");
		m.setId(101);

		out.writeObject(m);

		System.out.println("Done");

		FileInputStream file1 = new FileInputStream("F:\\obj1.ser");

		ObjectInputStream in = new ObjectInputStream(file1);

		Q6 m1 = (Q6) in.readObject();

		System.out.println("Name : " + m1.getName());
		System.out.println("Age : " + m1.getAge());
		System.out.println("Address : " + m.getAddress());
		System.out.println("Id : " + m.getid());

	}
}
