package Chapter5;

import java.util.Scanner;

public class FactorsOfInteger5_16 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n=scan.nextInt();
	int i=2;
	while(n!=0) {
		if(n%i==0)
		{	System.out.print(i+" ");
		
				n=n/i;
		}
		else
			i++;
	}
}
}
