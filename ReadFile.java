package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public void read(String fileName) {
		FileReader fr;
		try {
			if (fileName==null) {		// check fileName have any value being pass over
				System.out.println("Enter file name :");
				Scanner sc = new Scanner(System.in);	// fileName have no value and user is to enter the file name and to be store inside fileName
				fileName = sc.next();
				File f = new File(fileName+".doc");		// use f to store be a new file with name being enter by user
				if (!f.exists()) {						// no file with the name being enter by user
					System.out.println(fileName+" does not exist");	// error message
					
				}else {
					fr = new FileReader(fileName+".doc");	// file exist with user input name will be use by fileReader
			
					BufferedReader br = new BufferedReader(fr);		// create bufferedReader to read the fileReader
		
					String s;		
					while((s=br.readLine())!=null) {		// as long the next line inside the file is not null
						System.out.println(s);				// it will print everything out
					}	
				}
			}
			else {
				fr = new FileReader(fileName+".doc");		// fileName value is being pass over from writeFile class
				
				BufferedReader br = new BufferedReader(fr);
		
				String s;
				while((s=br.readLine())!=null) {
					System.out.println(s);
				}
			}
		}catch(IOException e) {
			System.out.println("Sorry! File Not Found.");
		}// end of try catch
	}// end of read method
}// end of ReadFile class
