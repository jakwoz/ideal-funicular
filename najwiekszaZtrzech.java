import java.util.Scanner;

public class najwiekszaZtrzech

{ public static void main(String[] args) 

{
	Scanner klawiatura = new Scanner(System.in);

	int a;
	
	
	
	System.out.print("Wprowadz pierwsza liczbe calkowita:  ");
	a = klawiatura.nextInt();
	
	int b;
	
	
	System.out.print("Wprowadz druga liczbe calkowita:  ");
	b = klawiatura.nextInt();
	
	
	int c;
	
	
	System.out.print("Wprowadz trzecia liczbe calkowita:  ");
	c = klawiatura.nextInt();
	
	
	
	if (a>b && a>c) {
		System.out.print("Liczba najwieksza jest: " + a);
	}
		
	else if (b>a && b>c) {
		System.out.print("Liczba najwieksza jest: " + b);
	}
	
	else if (c>a && c>b) {
		System.out.print("Liczba najwieksza jest: " + c);
	}
	
	else if (b==c) {
		System.out.print("Liczby sa rowne: " + b);
	}
	
	else if (a==c) {
		System.out.print("Liczby sa rowne: " + a);
	}
	
	else if (b==a) {
		System.out.print("Liczby sa rowne: " + b);
	}
	
	
	klawiatura.close();








}

}