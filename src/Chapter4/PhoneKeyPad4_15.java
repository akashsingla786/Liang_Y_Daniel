package Chapter4;

import java.util.Scanner;

public class PhoneKeyPad4_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char ch = scan.next().charAt(0);
		
		ch = Character.toUpperCase(ch);
		int number = 0;
		if (Character.isLetter(ch))
		{
			if (ch >= 'W')
				number = 9;
			else if (ch >= 'T')
				number = 8;
			else if (ch >= 'P')
				number = 7;
			else if (ch >= 'M')
				number = 6;
			else if (ch >= 'J')
				number = 5;
			else if (ch >= 'G')
				number = 4;
			else if (ch >= 'D')
				number = 3;
			else if (ch >= 'A')
				number = 2;
			System.out.println("The corresponding number is " + number);
		}
		else
			System.out.println(ch + " is an invalid input");
	}
}
