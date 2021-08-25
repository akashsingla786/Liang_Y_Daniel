package Chapter3;
import java.util.*;
public class RandomPoint3_16 {
public static void main(String ar[])
{
	Random ran=new Random();
	int x=ran.nextInt(51);
	int y=ran.nextInt(151);
	System.out.println("Random coordinates are ("+x +", "+y+")");
}
}
