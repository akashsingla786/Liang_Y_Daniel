package Chapter4;

import java.util.Scanner;

public class MajorAndStatus4_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two characters: ");
		String str = scan.nextLine();
		char m = Character.toUpperCase(str.charAt(0));
		char s = str.charAt(1); 
		switch(m)
		{
			case 'A': System.out.print("Accounting "); break;
			case 'C': System.out.print("Computer Science "); break;
			case 'I': System.out.print("Information Technology "); break;
			default : System.out.println("Invalid input");
						 System.exit(1);
		}
		switch(s)
		{
			case '1': System.out.println("Freshman"); break;
			case '2': System.out.println("Sophomore"); break;
			case '3': System.out.println("Junior"); break;
			case '4': System.out.println("Senior"); break;
			default : System.out.println("Invalid input");
		}
	}
}
