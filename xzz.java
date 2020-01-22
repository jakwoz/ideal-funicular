import java.util.Scanner;

public class xzz {

	public static void main (String[] args) {

		Scanner k = new Scanner(System.in);
		
		
		String wyraz;
		System.out.print("Wpisz ³añcuch tekstowy: ");
		wyraz = k.nextLine();
		
		wyraz.trim();

		wyraz.toLowerCase();
		
		int dlugosc = wyraz.length();
		
		int ostatniIndeks = dlugosc - 1;
		
		String wyrazmale.toLowerCase;
		
		int i;
		
		for (i = ostatniIndeks; i>=0;i--) {
			
			System.out.print(wyraz.charAt(i));	
			
		}
		
		
		k.close();
}

}