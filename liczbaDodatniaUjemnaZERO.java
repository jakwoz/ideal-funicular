import java.util.Scanner;
public class liczbaDodatniaUjemnaZERO

{ public static void main(String[] args) 

{
	
	
	Scanner klawiatura = new Scanner(System.in);

	int n;
	
	System.out.print("Wprowadz liczbe calkowita:  ");

	n = klawiatura.nextInt();

	
	
	if (n>0) {
		System.out.print("Liczba jest dodatnia!");
	}
	
	if (n<0) {
		System.out.print("Liczba jest ujemna!");
	}
	
	if (n==0) {
		System.out.print("Liczba jest ZEREM!");
	}
	
	
	
	
	
	klawiatura.close();



}

}








