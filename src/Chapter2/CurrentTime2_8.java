package Chapter2;
import java.util.*;
public class CurrentTime2_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	

		
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = scan.nextInt();

		
		long totalMilliseconds = System.currentTimeMillis();

		
		long totalSeconds = totalMilliseconds / 1000;

		
		long currentSecond = totalSeconds % 60;

				long totalMinutes = totalSeconds / 60;

		
		long currentMinute = totalMinutes % 60;

		
		long totalHours = totalMinutes / 60;

		
		long currentHour = totalHours % 24;
		currentHour = currentHour + offset;

		
		System.out.println("Current time is " + currentHour + ":"+ currentMinute + ":" + currentSecond);
	}
}
