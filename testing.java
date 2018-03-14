package file;

import java.util.Scanner;

public class testing {

	public static void main(String[] args) {	//user will be given 3choice to as following
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Create File");
		System.out.println("2. Write to File");
		System.out.println("3. Display content");
		System.out.println("Enter choice : ");
		Choice refChoice = new Choice();		// create reference to choice class
		refChoice.choice(sc.nextInt());			// the next integer input will be the choice and pass over to choice class
	}
}
