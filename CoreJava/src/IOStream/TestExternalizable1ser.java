package iOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestExternalizable1ser {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("F:\\object9.ser");

		ObjectOutputStream out = new ObjectOutputStream(file);
		Externalizable1 ext = new Externalizable1();

		ext.setName("Enaya");
		ext.setMaths(96);
		ext.setPhysics(95);
		ext.setChemistry(94);
		ext.setTemp(750);
		out.writeObject(ext);

		out.close();
		file.close();
		System.out.println("Done");

	}

}
