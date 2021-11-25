package Chapter5;

import java.util.Scanner;

public class DecimalToOctal5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimial interger: ");
		int decimal = input.nextInt();
		String octal = "";
		for (int i = decimal; i > 0; i /= 8) {
			octal = (i % 8) + octal; 
		}
		System.out.println("The binary value of the decimial " + decimal + " is: " + octal);
	}

}
