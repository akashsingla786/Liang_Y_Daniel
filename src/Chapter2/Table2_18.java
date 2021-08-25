package Chapter2;
import java.util.*;
public class Table2_18 {
public static void main(String ar[]) {
	System.out.println("  a"+'\t'+"  b"+'\t'+"Middle Point");
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		int a1=scan.nextInt();
		int a2=scan.nextInt();
		int b1=scan.nextInt();
		int b2=scan.nextInt();
		System.out.print("("+a1+", "+a2+")"+'\t'+"("+b1+", "+b2+")"+'\t');
		float av1=(float) ((a1+b1)/2.0);
		float av2=(float) ((a2+b2)/2.0);
		System.out.println("("+av1+", "+av2+")");
	}
}
}
