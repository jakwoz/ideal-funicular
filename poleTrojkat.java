import java.util.Scanner;
public class poleTrojkat

{ public static void main(String[] args) 

{
	Scanner klawiatura = new Scanner(System.in);

	double podstawa;
	
	System.out.print("Wprowadz podstawe trojkata:  ");
	podstawa = klawiatura.nextDouble();
	
	double wysokosc;
	
	System.out.print("Wprowadz wysokosc trojkata:  ");
	wysokosc = klawiatura.nextDouble();
	
	double pole = (podstawa * wysokosc) / 2;
	
	if (podstawa>0 && wysokosc>0) 
		System.out.print("Pole wynosi:  " + pole);
	
	else {
		System.out.print("Dane nieprawidlowe!");
	}
		
		
	
	
	 
	
	
	klawiatura.close();








}

}


