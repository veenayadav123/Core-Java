package iOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestMarksheetSer {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("F:\\object1.ser");

		ObjectOutputStream out = new ObjectOutputStream(file);

		MarksheetBean m = new MarksheetBean();
		
		m.setName("Enaya");
		m.setMaths(95);
		m.setPhysics(94);
		m.setChemistry(91);
		m.settempValue("786");

		out.writeObject(m);

		System.out.println("Done");
	}
	

}
