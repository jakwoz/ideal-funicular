import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		int n;
		System.out.print("Wprowadz rozmiar tablicy: ");
		n = k.nextInt();
		
		int tablica[] = new int[n];
		
		
		for (int i = 0;i<n;i++) {
			tablica[i] = i + 1;
			
		}
			
		int j = 0;
		while (j < tablica.length) {
			
			System.out.print(tablica[j] + ", ");
			j++;
		}
		k.close();
	
		
	}

}
