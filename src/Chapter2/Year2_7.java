package Chapter2;
import java.util.*;
public class Year2_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		System.out.print("Enter the number of minutes: ");
		int minutes = scan.nextInt();

		
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;

		
		System.out.println(minutes + " minutes is approximately " + years+ " years and " + days + " days");
	}
}
