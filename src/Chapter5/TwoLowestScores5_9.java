package Chapter5;

import java.util.Scanner;

public class TwoLowestScores5_9 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter the number of students:");
		  int n = input.nextInt();
		  int min = Integer.MAX_VALUE;
		  int secondMin = Integer.MAX_VALUE;
		  String minName = "";
		  String secondminName = "";
		 
		  for (int i = 0; i < n; i++) {
		   System.out.print("Enter name and score of student (" + (i + 1)   + "):");
		   String name = input.next();
		   int score = input.nextInt();
		 
		   if (score < min) {
		    secondMin = min;
		    secondminName = minName; 
		    min = score;
		    minName = name;
		   } else if (score <
				   secondMin) {
		    secondMin = score;
		    secondminName = name;
		   }
		 
		  }
		 
		  System.out.println("The student with the lowest score is " + minName);
		  System.out.println("The lowest score is " + min);
		  System.out.println("The student with the second lowest score is "  + secondminName);
		  System.out.println("The second lowest score is " + secondMin);
		 
		 }
}
