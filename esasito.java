import java.util.Scanner;
public class esasito {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		int n, m;
		System.out.print("Podaj ilosc wierszy w tabelicy: ");
		n = k.nextInt();
		
		System.out.print("Podaj ilosc kolumn w tabeli: ");
		m = k.nextInt();
		
		int tablica[][] = new int[n][m];
		
		int i = 0;
		while (i < n) {
			int j = 0;
			while (j < m) {
				tablica[i][j] = (i + 1) + j;
				j++;
			}
			i++;
		}
		
		
		
		for (int k1 = 0; k1 < n; k1++) {
			for (int l = 0; l < m; l++ )
				System.out.print(tablica[k1][l] + "\t");
			System.out.println();
		}
		
		k.close();
	

		
		
	}

}
