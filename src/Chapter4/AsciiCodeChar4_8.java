package Chapter4;
import java.util.Scanner;
public class AsciiCodeChar4_8 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter a character: ");
	char ch=scan.next().charAt(0);
	int a=ch;
	System.out.println("The ASCII code for character "+ch+" is "+a);
	
}
}
