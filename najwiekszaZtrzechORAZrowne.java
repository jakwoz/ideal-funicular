import java.util.Scanner;

public class najwiekszaZtrzechORAZrowne

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
	
	
	if (b==a && a==c && b==c) {
		System.out.println("Wszystkie liczby sa rowne: " + a);
	
	}
	
	else
	if (a==c) {
		System.out.println("Liczba pierwsza i trzecia sa rowne: " + a);
		
	}
	
	else
	if (b==c) {
		System.out.println("Liczba druga i trzecia sa rowne: " + b);

	}
	
	else
	
	if (b==a) {
		System.out.println("Liczba pierwsza i druga sa rowne: " + a);
		
	}
	
	if  (a>b && a>c) {
		System.out.print("Liczba najwieksza jest: " + a);
	}
		
	if (b>a && b>c) {
		System.out.print("Liczba najwieksza jest: " + b);
	}
	
	if (c>a && c>b) {
		System.out.print("Liczba najwieksza jest: " + c);
	}
	
	
	
	
	
	

	klawiatura.close();

}

}