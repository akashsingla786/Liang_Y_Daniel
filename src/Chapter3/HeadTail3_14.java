package Chapter3;
import java.util.*;
public class HeadTail3_14 {
public static void main(String ar[])
{
	Scanner scan=new Scanner (System.in);
	Random rn=new Random();
	int ran=rn.nextInt(2);
	System.out.print("Guess The number 0 for head and 1 for tail");
	int guess=scan.nextInt();
	if(ran==guess)
		System.out.println("Your guess was correct");
	else
		System.out.println("Your guess was incorrect");
}
}
