import java.util.Scanner;


public class najmniejszaZdwoch

{ public static void main(String[] args) 

{
	
	Scanner klawiatura = new Scanner(System.in);
	
	int a;
	
	System.out.print("Wprowadz pierwsza liczbe calkowita:  ");
	a = klawiatura.nextInt();
	
	int b;
	
	System.out.print("Wprowadz druga liczbe calkowita:  ");
	b = klawiatura.nextInt();
	
	
		
	if (a>b) {
		System.out.print("Liczba mniejsza jest: " + b);
	}
	
	if (a<b) {
		System.out.print("Liczba mniejsza jest: " + a);
	}
	
	if (a==b) {
		System.out.print("Liczby sa rowne: " + a);
	}
	
	klawiatura.close();
	
	
}

}