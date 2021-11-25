package Chapter5;

import java.util.Scanner;

public class BitLevelOperations5_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		short number = input.nextShort();

		String bits = "";	// Holds the bits
		for (int i = 0; i < 8; i++) {
			bits = (number & 1) + bits;
			number >>= 1;
		}

		System.out.println("The bits are " + bits);
	}

}
