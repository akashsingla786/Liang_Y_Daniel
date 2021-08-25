package Chapter3;
import java.util.*;
public class Lottery3_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lottery = (int)(Math.random() * 1000);
		System.out.print("Enter a three-digit number: ");
		int guess = input.nextInt();
		int l1 = lottery / 100;
		int remainingDigits = lottery % 100;
		int l2 = remainingDigits / 10;
		int l3 = remainingDigits % 10;
		int g1 = guess / 100;
		int remainingDigits1 = guess % 100;
		int g2 = remainingDigits1 / 10;
		int g3 = remainingDigits1 % 10;
		System.out.println("The lottery number is " + lottery);
		if (guess == lottery)
			System.out.println("Exact match: you win $12,000");
		else if (g1 == l1 && g3 == l2 && g2 == l3 ||
		        g2 == l1 && g1 == l2 && g3 == l3 ||
		        g2 == l1 && g3 == l2 && g1 == l3 ||
		        g3 == l1 && g1 == l2 && g2 == l3 ||
		        g3 == l1 && g2 == l2 && g1 == l3)
		{
			System.out.println("Match all digits: you win $5,000");
		}
		else if (g1 == l1 || g1 == l2 || g1 == l3 ||
		        g2 == l1 || g2 == l2 || g2 == l3 ||
		        g3 == l1 || g3 == l2 || g3 == l3)
		      System.out.println("Match one digit: you win $2,000");
		else
			System.out.println("No Digit Matched");
	}
}
