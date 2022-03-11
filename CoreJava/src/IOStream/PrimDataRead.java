package IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrimDataRead {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("F:\\Binary.dat");
		
		DataInputStream in = new DataInputStream(file);
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
	}

}
