import java.util.Scanner;

public class parzystaCZYnieparzysta 

{ public static void main(String[] args) 

{
	

	Scanner klawiatura = new Scanner(System.in); 
	
	int n;

	System.out.print("Wprowadz liczbe calkowita:  ");

	n = klawiatura.nextInt();
	
	if (n==0) {
	    System.out.print("Wartosc nie moze wynosic ZERO!");
	}
	else 
	
		if (2%n==0)
	
		System.out.print("Liczba jest parzysta!");
	
	else {
	
	System.out.print("Liczba jest nieparzysta!");
	}
	klawiatura.close();
	
}
	

	 
	
	
	
	
	
	
}

