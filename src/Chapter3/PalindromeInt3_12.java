package Chapter3;
import java.util.*;
public class PalindromeInt3_12 {
public static void main(String ar[]) {
	Scanner scan=new Scanner (System.in);
	System.out.print("Enter a Three digit  number: ");
	int n=scan.nextInt();
	if(n<0)
		n=-1*n;
	int temp=n;
	int sum=0;
	
	while(n>0) {
		int r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(sum==temp)
		System.out.println(temp+" is a palindrome");
	else
		System.out.println(temp+" is not a palindrome");
		
}
}
