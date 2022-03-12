package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestExternalizable1ser {

	public static void main(String[] args) throws IOException {

		Externalizable1 ext = new Externalizable1();
		
		ext.setName("Enaya");
		ext.setMaths(96);
		ext.setPhysics(95);
		ext.setChemistry(94);
		ext.setTemp(75);

		FileOutputStream file = new FileOutputStream("F:\\object9.ser");

		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(ext);
		

		System.out.println("Done");

	}

}
