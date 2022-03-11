package IOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimDataWritePtoBin {
	
	public static void main(String[] args) throws IOException {
	
		FileOutputStream file = new FileOutputStream("F:\\Binary.dat");
		DataOutputStream out = new DataOutputStream(file);
		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('A');
		out.writeDouble(1.5);
		out.close();
		
		System.out.println("Inserted");
		
	}

}
