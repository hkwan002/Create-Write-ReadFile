package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
	Scanner sc = new Scanner(System.in);
	ReadFile refRead = new ReadFile();
	public void write(String fileName) {
		try {							// check if fileName being pass over have any value
			if (fileName==null) {		// fileName value is null
				boolean file = false;
				while (!file) {			// file loop will run on as long as file is false
					System.out.println("Enter the file name :");	// user will be prompt to enter file name
					fileName = sc.next();
					File f = new File(fileName+".doc");
					if (!f.exists()) {			// check whether file with user enter name exists
						System.out.println(fileName+" does not exist");		// error message when file does not exists
					}else {								// file with user enter name exists
						FileWriter fw = new FileWriter(fileName+".doc");	// create fileWriter
						BufferedWriter br = new BufferedWriter(fw);			// create bufferedwriter which will enter into file name that user enter
						file = true;										// end file loop
						boolean choice = false;	
						while (!choice) {				// choice loop will run as long as choice is false
							System.out.println("Input will be enter into the file :");
							br.write(sc.nextLine());	// the next line input by user using scanner will be write into the file using bufferedwriter
							br.write(sc.nextLine());	// 2nextLine as the loop will run over to the next printout if only 1 nextLine statement
							br.newLine();				// changing to new line for input text
							
							boolean next = false;
								while (!next) {			// next loop will run as long as next is false
									System.out.println("Next line?");	// prompt user if they still want to enter into file in next line
									String nextLine = sc.next();		// decision will be store in nextLine
									if (nextLine.equalsIgnoreCase("yes")) {	// value store in nextLine is yes
										next = true;						// end next loop but choice loop will run again so user and input to next line
									}else if (nextLine.equalsIgnoreCase("no")) {	// value store in nextLine is no
										next = true;						// end next loop
										choice = true;						// end choice loop
									}else
										System.out.println("Invalid input.");	// invalid input and restart next loop
									}// end of next while loop
						}// end of choice while loop
						br.close(); // close bufferedWriter
					}// end of else statement
				}// end of file while loop
				
				refRead.read(fileName);		//run read method inside readFile class
				
			}else {
				FileWriter fw = new FileWriter(fileName+".doc");	// file being create inside createFile class and pass over fileName value
				BufferedWriter br = new BufferedWriter(fw);			// coding is basically similar to above so comments can read above
				boolean choice = false;
				while (!choice) {		
					System.out.println("Input will be enter into the file :");
					br.write(sc.nextLine());
					br.write(sc.nextLine());
					br.newLine();
					boolean next = false;
					while (!next) {			//
						System.out.println("Next line?");
						String nextLine = sc.next();
						if (nextLine.equalsIgnoreCase("yes")) {
							next = true;
						}else if (nextLine.equalsIgnoreCase("no")) {
							next = true;
							choice = true;
						}else
							System.out.println("Invalid input.");
						}
				}
				br.close();
				refRead.read(fileName);
			}
			
		}catch (IOException e) { }

	}// end of try catch
}// end of writeFile class
