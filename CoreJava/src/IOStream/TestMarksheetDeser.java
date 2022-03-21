package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestMarksheetDeser {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream file = new FileInputStream("F:\\object1.ser");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		MarksheetBean m = (MarksheetBean) in.readObject();
		
		System.out.println("Name :" + m.getName());
		System.out.println("Maths :" + m.getMaths());
		System.out.println("Physics :" + m.getPhysics());
		System.out.println("Chemistry :" + m.getChemistry());
		System.out.println("TempValue :" + m.gettempValue());
	}
	

}
