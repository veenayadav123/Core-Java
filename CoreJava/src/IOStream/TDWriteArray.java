package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class TDWriteArray {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("F:\\Text File\\Text3",true);

		char[] cArray = { 'H', 'i' };
		fw.write('g');
		fw.write("Amaya");
		fw.write(cArray);
		fw.close();

		System.out.println("Done");
	}

}
