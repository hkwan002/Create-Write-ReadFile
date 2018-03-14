package file;

import java.io.File;
import java.util.Scanner;

public class CreateFile {
	
	public void create() {
		try {
			
			boolean newFile = false;
			while(!newFile) {	// it will keep running this loop as long as newFile is false
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter new file name : ");	
				String fileName = sc.next();			// user enter will be save as fileName
				File f = new File(fileName+".doc");		// fileName.doc store as f
		
				if (f.exists()==true) {					// check if fileName.doc exists, if exists will print error message
					System.out.println(fileName+" already exists.");					
				}else {			
					newFile = f.createNewFile();		// fileName.doc does not exists then create a new file with the name written and store as doc file
					WriteFile refWrite = new WriteFile();	// create a reference to writeFile class
					refWrite.write(fileName);			// run write method in writeFile class
				}
			}
		}catch (Exception e) { }
	}//end of create method
}// end of createFile Class
