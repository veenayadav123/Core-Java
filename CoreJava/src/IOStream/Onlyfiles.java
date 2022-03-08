package IOStream;

import java.io.File;

public class Onlyfiles {
	
	public static void main(String[] args) {
		
		File f = new File("F:/Text File");
	  //File f = new File(rags[0]); 
		
		String[] list = f.list();
		for(int i=0; i<list.length; i++) {
			
			if(f.isFile()) {
				
				System.out.println((i+1)+" : "+list[i]);
			}
			
		}
	}

}
