
import java.util.Scanner;
public class menuMath {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		
		System.out.println("MENU:");
		
		System.out.println("PI - wybierz 1");
		 
		System.out.println("E - wybierz 2");
		
		System.out.println("Potegowanie - wybierz 3");
		
		System.out.println("Pierwiastkowanie - wybierz 4");
		
		System.out.println("Bezwzgledna - wybierz 5");
		
		System.out.println("Minimalna - wybierz 6");
		
		System.out.println("Maksymalna - wybierz 7");
		
		System.out.println("Cosinus - wybierz 8");
		
		System.out.println("Sinus - wybierz 9");
		
		System.out.println("Tanges - wybierz 10");
		
		System.out.println("Zaokraglanie - wybierz 11");
		
		int menu;
		
		
		System.out.println("Wybierz numer: ");
		menu = k.nextInt();
		
		
		
		switch(menu) {
		
case 1: 
	 System.out.print(Math.PI); break;
case 2: 
	System.out.print(Math.E); break;
case 3: 
	int a;
	System.out.println("Podaj liczbe calkowita: ");
	a = k.nextInt();
	
	int b;
	System.out.println("Podaj potege: ");
	b = k.nextInt();
	
	double wynik;
	wynik = Math.pow(a,b);
	
	System.out.print(a + "do potegi" +  b + "=" +  wynik);
	
	break;
case 4: 
	double c;
	System.out.println("Podaj liczbe: ");
	c = k.nextInt();
	
	double wynik1;
	wynik1 = Math.sqrt(c);
	
	System.out.print("Pierwiastek z" +  c + "=" +  wynik1);
	
	break;
case 5: 
	double x;
	System.out.println("Podaj liczbe: ");
	x = k.nextInt();
	
	double wynik2;
	wynik2 = Math.abs(x);
	
	System.out.print("Wartosc bezwzgledna z" +  x + "=" +  wynik2);
	
	break;
case 6: 
	double j;
	System.out.println("Podaj liczbe: ");
	j = k.nextInt();
	
	double z;
	System.out.println("Podaj druga liczbe: ");
	z = k.nextInt();
	
	double wynik3;
	wynik3 = Math.min(z,j);
	
	System.out.print("Mniejsza liczba to " +  wynik3);
	
	break;	
case 7: 
	double s;
	System.out.println("Podaj liczbe: ");
	s = k.nextInt();
	
	double f;
	System.out.println("Podaj druga liczbe: ");
	f = k.nextInt();
	
	double wynik4;
	wynik4 = Math.max(s,f);
	
	System.out.print("Wieksza liczba to: " +  wynik4);
	
	break;
case 8: 
	double q;
	System.out.println("Podaj liczbe: ");
	q = k.nextInt();
	
	double wynik5;
	wynik5 = Math.sin(q);
	
	Math.toRadians(q);
	
	System.out.print("Sinus z tej liczby to: " +  wynik5);
	
	break;
case 9: 
	double i;
	System.out.println("Podaj liczbe: ");
	i = k.nextInt();
	
	double wynik6;
	wynik6 = Math.sin(i);
	
	Math.toRadians(i);
	
	System.out.print("Cosinus z tej liczby to: " +  wynik6);
	
	
	
	
	break;
case 10: 
	double l;
	System.out.println("Podaj liczbe: ");
	l = k.nextInt();
	
	double wynik7;
	wynik7 = Math.sin(l);
	
	Math.toRadians(l);
	
	System.out.print("Sinus z tej liczby to: " +  wynik7);
	
	
	
	
	break;
case 11: 
	double h;
	System.out.println("Podaj liczbe calkowita: ");
	h = k.nextInt();
	
	double wynik8;
	wynik8 = Math.round(h);
	
	System.out.print("Zaokraglnie tej liczby wynosi: " +  wynik8);
	
	
	
	
	break;
	

		default:System.out.print("ERROR");
		
		
		}
		
		k.close();
		
		

	}

}