import java.util.Scanner;

public class czasDroga 

{ 
	public static void main(String[] args)

	{
		
		Scanner klawiatura = new Scanner(System.in);
		
		double velocityKMperH;
		
		System.out.print("Wprowadz predkosc (km/h):  ");
		velocityKMperH = klawiatura.nextDouble();
		
		int distanceKM = 132;
		
		double timeH = distanceKM / velocityKMperH;
	
		System.out.println("Przy podanej predkosci czas przebycia tej drogi bedzie wynosil (h): " + timeH);
		
		if (velocityKMperH ==0);
			System.out.println("Stoisz w miejscu");
		
		
		
		klawiatura.close();
	
	}

}

