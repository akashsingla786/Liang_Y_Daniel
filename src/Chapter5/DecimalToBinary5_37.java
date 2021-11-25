package Chapter5;

import java.util.Scanner;

public class DecimalToBinary5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimial interger: ");
		int decimal = input.nextInt();
		String binary = "";
		for (int i = decimal; i > 0; i /= 2) {
			binary = (i % 2) + binary; 
		}
		System.out.println("The binary value of the decimial " + decimal + " is: " + binary);
	}

}
