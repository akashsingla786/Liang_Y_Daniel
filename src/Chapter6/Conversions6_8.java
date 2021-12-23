package Chapter6;

public class Conversions6_8 {
public static void main(String ar[]) {
	mileToKilo();
	kiloToMile();
}
public static void mileToKilo() {
	System.out.println("Miles		"+"    Kilometers"	);
	for(int i=1;i<=10;i++) {
		System.out.println(i+"			"+(i*1.6)	);
	}
	
	}

public static void kiloToMile() {
	System.out.println("Kilometers         "+"     Miles");

	for(int i=20;i<=65;i=i+5) {
		System.out.println(i+"         		 "+i/1.6);
	}
}

}
