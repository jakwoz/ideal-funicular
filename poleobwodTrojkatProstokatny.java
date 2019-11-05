import java.util.Scanner;
public class poleobwodTrojkatProstokatny

{ public static void main(String[] args) 

{
	Scanner klawiatura = new Scanner(System.in);

	double base;
	
	System.out.print("Wprowadz podstawe trojkata:  ");
	base = klawiatura.nextDouble();
	
	double height;
	
	System.out.print("Wprowadz wysokosc trojkata:  ");
	height = klawiatura.nextDouble();
	
	double sideA;
	
	System.out.print("Wprowadz drugi bok trojkata:  ");
	sideA = klawiatura.nextDouble();
	
	double sideB;
	
	System.out.print("Wprowadz trzeci bok trojkata:  ");
	sideB = klawiatura.nextDouble();
	
	
	double area = (base * height) / 2;
	
	if (base>0 && height>0) 
		System.out.println("Pole wynosi:  " + area);
	
	else {
		System.out.print("Dane nieprawidlowe!");
	}
		
	double perimeter = base + sideA + sideB;
	
	if (base>0 && height>0) 
		System.out.println("Obwod wynosi:  " + perimeter);
	else {
		System.out.print("Dane nieprawidlowe!");
	}
	
	
	
	klawiatura.close();








}

}


