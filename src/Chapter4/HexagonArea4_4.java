package Chapter4;
import java.util.*;
public class HexagonArea4_4 {
public static void main(String ar[]) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the side: ");
	float s=scan.nextFloat();
	float area=(float) ((6*s*s)/(4*Math.tan(3.14159/6.0)));
	System.out.printf("%.2f", area);
}
}
