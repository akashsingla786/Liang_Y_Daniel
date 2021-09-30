package Chapter5;

public class DemonstrateCancellationErrors5_23 {
public static void main(String ar[]) {
	 double leftSum = 0.0;
     for (int i = 50000; i >= 1; i--) {
         leftSum += 1.0 / i;
     }
     System.out.println("Computing from right to left " + leftSum);


     double rightSum = 0.0;
     for (int i = 1; i <= 50000; i++) {
         rightSum += 1.0 / i;
     }
     System.out.println("Computing from left to right " + rightSum);

     double difference =leftSum - rightSum;
     System.out.println("difference is " + difference);
}
}
