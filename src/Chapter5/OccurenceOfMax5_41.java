package Chapter5;

import java.util.Scanner;

public class OccurenceOfMax5_41 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	
	
	System.out.print("Enter numbers :");
int n=scan.nextInt();
int count=1;
int max=n;

while(n!=0) {
	if(n==max)
		count++;
  if(n>max)
  {
	  max=n;
	  count=1;
	  
  }
  n=scan.nextInt();
}
System.out.println("The largest number is :"+max);
System.out.println("The occurence of largest number is :"+count);
}
}
