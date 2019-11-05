import java.util.Scanner;
public class liczbaDodatnia

{ public static void main(String[] args) 

{
	
	Scanner klawiatura = new Scanner(System.in);
	
	int n;

	System.out.print("Wprowadz liczbe calkowita:  ");

	n = klawiatura.nextInt();

	if (n>0)
		System.out.print("Liczba jest dodatnia!");
	else
		System.out.print("Liczba nie jest dodatnia!");

	klawiatura.close();








}

}
