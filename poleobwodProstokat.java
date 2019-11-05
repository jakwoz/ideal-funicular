import java.util.Scanner;

public class poleobwodProstokat

{ 
	public static void main(String[] args) 

{
	Scanner klawiatura = new Scanner(System.in);

	double sideA; 
	
	
	System.out.print("Podaj bok A:  ");
	sideA = klawiatura.nextDouble();
	
	double sideB;
	
	System.out.print("Podaj bok B:  ");
	sideB = klawiatura.nextDouble();
	
	
	double area = sideA * sideB;
	
	if(sideA>0 && sideB>0) {
	 System.out.println("Pole tego prostokata wynosi:  " + area);
}
	else {
	System.out.print("Dane sa nieprawidlowe");
	
	}
	
	double perimeter = (2 * sideA) + (2 * sideB);
	
	if (sideA>0 && sideB>0) {
		System.out.println("Obwod tego prostokata wynosi:  " + perimeter);
	
	}
	else {
		System.out.print("Dane sa nieprawidlowe");
	}
	
	klawiatura.close();

}

}

