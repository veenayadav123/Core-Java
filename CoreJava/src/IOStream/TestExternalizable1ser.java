package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestExternalizable1ser {

	public static void main(String[] args) throws IOException {

		Externalizable1 ext = new Externalizable1("Amaya", 95, 96, 91, 1);

		FileOutputStream file = new FileOutputStream("F:\\object5.ser");

		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(ext);
		

		System.out.println("Done");

	}

}
