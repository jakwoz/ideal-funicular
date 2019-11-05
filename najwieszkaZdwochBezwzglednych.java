import java.util.Scanner;


public class najwieszkaZdwochBezwzglednych

{ public static void main(String[] args) 

{
	
	Scanner klawiatura = new Scanner(System.in);
	
	int a;
	
	System.out.print("Wprowadz pierwsza liczbe calkowita:  ");
	a = klawiatura.nextInt();
	
	int b;
	
	System.out.print("Wprowadz druga liczbe calkowita:  ");
	b = klawiatura.nextInt();
	
	

	
	     
	if ((a>=0)    &&(b>=0)) {
    	
   
    if (a>b)
		System.out.print("Liczba o wiekszej wartosci bezwzglednej jest jest: " + a);
    
    if (b>a)
    	System.out.print("Liczba o wiekszej wartosci bezwzglednej jest jest: " + b);
	
    if (b==a)
	    System.out.print("Liczby maja ta sama wartosc bezwzgledna: " + a);
	
	
	}
	

	
	
	if ((a>=0)    &&(b<=0)) {
	    	b = b * (-1);
	   
	    if (a>b)
	    	System.out.print("Liczba o wiekszej wartosci bezwzglednej jest jest: " + a);
	    
	    if (b>a)
	    	System.out.print("Liczba o wiekszej wartosci bezwzglednej jest jest: " + b);
	    
	    if (b==a)
	    	System.out.print("Liczby maja ta sama wartosc bezwzgledna: " + a);
	
	
	}
	    
	 
	    
	    
	    if ((a<=0)    &&(b>=0)) {
	    	a = a * (-1);
	   
	    if (a>b)
	    	System.out.print("Liczba o wiekszej wartosci bezwzglednej jest jest: " + a);
		   
	    
	    if (b>a)
	    	System.out.print("Liczba o wiekszej wartosci bezwzglednej jest jest: " + b);
	   
	    if (b==a)
	    	System.out.print("Liczby maja ta sama wartosc bezwzgledna: " + a);
	    
	    
	    
	    }
	   
	    
	    
	    if ((a<=0)    &&(b<=0)) {
	    	a = a * (-1);
	        b = b * (-1);
	    if (a>b)
	    	System.out.print("Liczba o wiekszej wartosci bezwzglednej jest jest: " + a);
		   
	    
	    if (b>a)
	    	System.out.print("Liczba o wiekszej wartosci bezwzglednej jest jest: " + b);
	    
	    if (b==a)
	    	System.out.print("Liczby maja ta sama wartosc bezwzgledna: " + a);
	    
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    klawiatura.close();	 
}		 
	
}
