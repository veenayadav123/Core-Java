package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyATextFile {
	
	public static void main(String[] args) throws IOException {
		
		//String source = "F:\\Text File\\Rays.txt";
		String target = "F:\\Text File\\a.txt";
		
		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(target);
		
		int ch = reader.read();
		while(ch!=-1) {
			writer.write(ch);
			ch = reader.read();
			
		}
		writer.close();
		reader.close();
		System.out.println(source +" is copied to " +target);
	}

}
