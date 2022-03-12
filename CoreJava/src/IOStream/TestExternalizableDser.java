package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestExternalizableDser {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("F:\\object9.ser");

		ObjectInputStream in = new ObjectInputStream(file);

		Externalizable1 ext = (Externalizable1) in.readObject();

		System.out.println("Name :" + ext.getName());
		System.out.println("Maths :" + ext.getMaths());
		System.out.println("Physics :" + ext.getPhysics());
		System.out.println("Chemistry :" + ext.getChemistry());
		System.out.println("TempValue :" + ext.getTemp());

		in.close();
		file.close();
	}

}
