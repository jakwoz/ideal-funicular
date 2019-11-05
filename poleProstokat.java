import java.util.Scanner;

public class poleProstokat

{ 
	public static void main(String[] args) 

{
	Scanner klawiatura = new Scanner(System.in);

	double sideA; 

	System.out.print("Wprowadz dlugosc boku A:  ");
	sideA = klawiatura.nextDouble();
	
	
	double sideB;
	
	System.out.print("Wprowadz dlugosc boku B:  ");
	sideB = klawiatura.nextDouble();
	
	
	double area = (sideA * sideB);
	
	if(sideA>0 && sideB>0) {
	 System.out.print("Pole tego prostokata wynosi: " + area);
}
	else {
	System.out.print("Dane sa nieprawidlowe");
	
	}
	klawiatura.close();

}

}

