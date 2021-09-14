package Chapter5;

public class SquareMeterToPing5_6 {

public static void main(String ar[]) {
	
	System.out.println("Ping"+"			"+"Square Meter");
	for(int i=10;i<=80;i=i+5)
	{
		float f=(float) (i*3.305);
		System.out.println(i+"			"+f);
	}
	
	
	System.out.println("Square Meter"+"			"+"Ping");
	for(int i=30;i<=100;i=i+5)
	{
		float c=(float) (i/3.305);
		System.out.println(i+"			"+c);
	}
}
}
