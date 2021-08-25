package Chapter2;
import java.util.*;
public class PopulationProj2_11 {
	public static void main(String[] strings) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter the number of years: ");
			int n=scan.nextInt();
	       double birth=31536000/7.0;
	       double death=31536000/13.0;
	       double immigrant=31536000/45.0;
	       double currPop=312032486.0;
	       		
	       for(int i=0;i<n;i++)
	       {
	    	   currPop=currPop+birth+immigrant-death;
	    	   
	       }
	       System.out.println("The population in "+n+" years is "+(int )currPop);

	    }
}
