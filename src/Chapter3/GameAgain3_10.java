package Chapter3;
import java.util.*;
public class GameAgain3_10 {
public static void main(String ar[])
{
	Scanner input = new Scanner(System.in);
	Random rn=new Random();
	int number1 = rn.nextInt(100)+1;
	int number2 = rn.nextInt(100)+1;
	System.out.print("What is " + number1 + " + " + number2 + "? ");
	int answer = input.nextInt();
	if (number1 + number2 == answer)
		System.out.println("You are correct!");
	else
		System.out.println("You are wrong " + number1 + " + " + number2
			+ " should be " + (number1 + number2));
}
}
