package Chapter3;
import java.util.*;
public class SortNumbers3_8 {
public static void main(String ar[])
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter three integers: ");
	int number1 = scan.nextInt();
	int number2 = scan.nextInt();
	int number3 = scan.nextInt();


	int temp;
	if (number2 < number1 || number3 < number1)
	{
		if (number2 < number1)
		{
			temp = number1;
			number1 = number2;
			number2 = temp; 
		}
		if (number3 < number1)
		{
			temp = number1;
			number1 = number3;
			number3 = temp;
		}
	}
	if (number3 < number2)
	{
		temp = number2;
		number2 = number3;
		number3 = temp;
	}


	System.out.println(number1 + " " + number2 + " " + number3);
}
}
