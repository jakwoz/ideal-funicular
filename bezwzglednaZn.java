import java.util.Scanner;

public class bezwzglednaZn 

{ public static void main(String[] args) 

{
	Scanner klawiatura = new Scanner(System.in);
	
	int n;


	System.out.print("Wprowadz liczbe calkowita: ");
	
	n = klawiatura.nextInt();


	if (n>=0)
	
		System.out.print("Wartosc bezwzgledna z tej liczby to: " + n);
	
	else {
	
		n = n * (-1);
	
		System.out.print("Wartosc bezwzgledna z tej liczby to: " + n);
	}

	
	klawiatura.close();
}

}