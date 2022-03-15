package ExcpHandlng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestFinallyBlock {

	public static void main(String[] args) throws Exception {

		InputStream input = null;
		try {
			/*input = new FileInputStream("F:\\Text File\\a.txt");

			int data = input.read();
			while (data != -1) {

				System.out.print((char) data);
				data = input.read();
				
				
*/			int i=20;
			int j=0;
			int k = i/j;
			
			System.out.println(k);
			
		}

		catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.exit(0);
		}

		finally {
			
			System.out.println("Finally Block");
						}
		}

	}

