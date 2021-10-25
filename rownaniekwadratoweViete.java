import java.util.Scanner;
public class rownaniekwadratoweViete {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		
		
		double a;
		System.out.println("Wprowadz a: ");
		a = k.nextInt();
		
		double b;
		System.out.println("Wprowadz a: ");
		b = k.nextInt();
	
		double c;
		System.out.println("Wprowadz a: ");
		c = k.nextInt();
	
		double delta = (Math.pow(b, 2)) - (4 * a * c);
		
		if(delta>=0) {
			double sumax = (b / a) * -1;
			double iloczynx = (c / a);
			System.out.println("Delta jest rowna lub wieksza od 0, oznacza to 2 rozwiazania");
			System.out.println("Suma miejsc zerowych wynosi = " + sumax);
			System.out.println("x1 = " + iloczynx);
		}
			else
				System.out.print("Delta jest rowna: " + delta + " brak rozwiazan");

	k.close();
	
	
	}

}