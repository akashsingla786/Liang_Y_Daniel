package Chapter5;

public class CToFAndFToC5_5 {

public static void main(String ar[]) {
	
	System.out.println("Celsius"+"			"+"Fahrenheit");
	for(int i=0;i<=100;i=i+2)
	{
		float f=(float) ((i*9/5.0)+32);
		System.out.println(i+"			"+f);
	}
	
	
	System.out.println("Fahrenheit"+"			"+"Celsius");
	for(int i=20;i<=270;i=i+5)
	{
		float c=(float) ((i-32)*5/9.0);
		System.out.println(i+"			"+c);
	}
}
}
