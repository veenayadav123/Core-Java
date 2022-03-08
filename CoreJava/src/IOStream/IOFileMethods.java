package IOStream;

import java.io.File;
import java.util.Date;

public class IOFileMethods {
	
	public static void main(String[] args) {
		
		File f = new File("F:/Text File/Rays.txt");
	  //File f = new File("F:/Text File" , "Rays ");
		
		if(f.exists()) {
			
			System.out.println("Name :"+ f.getName());
			System.out.println("Absolute path :"+f.getAbsolutePath());
			System.out.println("Is Writable :"+f.canWrite());
			System.out.println("Is Readable :"+f.canRead());
			System.out.println("Is File :"+f.isFile());
			System.out.println("Is Directory :"+ f.isDirectory());
			System.out.println("Last Modified at :"+new Date(f.lastModified()));
			System.out.println("Length :"+f.length()+ "byte long");
			
			
			
		}
	}

}
