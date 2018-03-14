package file;

import java.util.Scanner;

public class Choice {
	CreateFile refCreate = new CreateFile();
	WriteFile refWrite = new WriteFile();
	ReadFile refRead = new ReadFile();
	Scanner sc = new Scanner(System.in);
	public void choice(int choice) {	// choice will be pass over from testing class
		switch (choice) {			// switch case where choice will be the key
		case 1:						// value for key as 1
			refCreate.create();		// it will run create method in CreateFile class
			break;
		case 2:						// value for key as 2
			refWrite.write(null);	// it will run write method in WriteFile class with null value
			break;
		case 3:						// value for key as 3
			refRead.read(null);		// it will run read method in ReadFile class with null value
			break;

		default:					// value for key that is not 1,2 or 3
			System.out.println("Invalid choice. Please re-enter choice :");	// error message and prompt user to re-enter choice
			this.choice(sc.nextInt());		//re-enter choice
			break;
		}// end of switch case
	}// end of choice method
}// end of choice class
