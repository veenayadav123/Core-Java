package IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TDWriteFile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("F:\\Text File\\Rays.txt",true);//Append Text by true
		PrintWriter pw = new PrintWriter(writer);
		
		for(int i=0; i<5; i++) {
			
			pw.println(i+": Line Hello Ray's ");
			
		}
		pw.close();
		writer.close();
		
		System.out.println("File is successfully written, PI check F:\\Text File\\Rays.txt");
	}

}
