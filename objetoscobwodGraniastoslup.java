import java.util.Scanner;

public class objetoscobwodGraniastoslup

{ 
	public static void main(String[] args) 

{
	Scanner klawiatura = new Scanner(System.in);
	
	double side;
	
	System.out.print("Wprowadz bok trojkata:  ");
	side = klawiatura.nextDouble();
	
	double height;
	
	System.out.print("Wprowadz wysokosc trojkata:  ");
	height = klawiatura.nextDouble();
	
	
	double area = ( (Math.pow(side, 2)* Math.sqrt(3) ) / 4 ) * height;
	
	
	if (side>0 && height>0)
		System.out.println("Pole tego graniastoslupa wynosi:  " + area);
	
	else {
		System.out.println("Dane nieprawidlowe");
	}
	
	double perimeter = (6 * side) + (height * 3); 
			
	if (side>0 && height>0)	
		System.out.println("Laczna dlugosc wszystkich krawedzi tego graniastoslupa wynosi:  " + perimeter);
	
	else {
		System.out.println("Dane nieprawidlowe");
	}
	
	
		



	
	
	
	
	klawiatura.close();
}




}