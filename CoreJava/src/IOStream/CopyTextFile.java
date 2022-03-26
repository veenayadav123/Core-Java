package iOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
	
	public static void main(String[] args) throws Exception {
		
		String source = "F:\\Text File\\a.txt";
		String target = "F:\\Text File\\b.txt";
		
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
