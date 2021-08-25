package Chapter3;

import java.util.Scanner;

public class EvenOdd3_35 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int n=scan.nextInt();
	if(n%2==0)
		System.out.println(n+" is even number");
	else
		System.out.println(n+" is odd number");
}
}
