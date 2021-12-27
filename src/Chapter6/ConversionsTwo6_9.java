package Chapter6;

public class ConversionsTwo6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poundToKilogram();
		kilogramToPound();
	}
	public static void poundToKilogram()
	{
		
		System.out.println("Pounds	Kilograms");
		for(int i=20;i<=515;i=i+5) {
			float f=(float) (0.453*i);
			System.out.println(i+"         "+f	);
		}
		
	}
	public static void kilogramToPound() {
		System.out.println("Kilograms	Pounds");
		for(int i=1;i<=199;i=i+2) {
			float f=(float) (2.204*i);
			System.out.println(i+"         "+f	);
		}
		
	}
}
