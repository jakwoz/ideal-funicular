import java.util.Scanner;
public class rownaniekwadratoweDelta {

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
		
		
		if(delta>0) {
			double x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
			double x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);
			System.out.println("Delta jest rowna, oznacza to 2 rozwiazania");
			System.out.println("x1 = " + x1);
			System.out.println("x1 = " + x2);
		}
			if (delta==0) {
			double x3 = (b * -1) / (2 * a);
			System.out.println("Delta jest rowna zero, oznacza to 1 rozwiazanie");
			System.out.println("x1 = " + x3);
			}
			
			else
				System.out.print("Delta jest rowna: " + delta + " brak rozwiazan");
			
	
	
	
	
	
	
	
	
	
	
	
k.close();

}



}