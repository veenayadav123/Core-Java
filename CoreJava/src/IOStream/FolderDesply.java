package iOStream;

import java.io.File;

public class FolderDesply {
	
	public static void main(String[] args) {
		
		File directory = new File("F:\\Text File");
		
		String[] list = directory.list();
		
		for(int i=0; i<list.length; i++) {
			
			System.out.println((i+1)+" : "+list[i]);
			
		}
	}

}
