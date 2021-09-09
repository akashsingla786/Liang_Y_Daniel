package Chapter4;

import java.util.Scanner;

public class Monetrayunits4_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount, for example 11.56: ");
		String amount = input.nextLine();
		String dollar = amount.substring(0, amount.indexOf('.'));
		int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));
		System.out.println("Dollars: "+dollar+" and cents :"+cents);
	
	}}
