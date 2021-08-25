package Chapter3;
import java.util.*;
public class CostOfShip3_18 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the weight of package: ");
	float w=scan.nextFloat();
	
	
	if(w>20)
		System.out.println("The package cannot be shipped.");
	else
	{float cost=0;
	if(w>0 && w<=2 )
		cost= (float) 2.5;
	else if(w>2 && w<=4)
		cost=(float)4.5;
	else if(w>4 && w<=10)
		cost=(float)7.5;
	else if(w>10 && w<=20)
		cost=(float)10.5;
	
	System.out.println("Shipping cost of package is: $"+ cost*w);
	
	}
	
	
	
}
}
