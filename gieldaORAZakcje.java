public class gieldaORAZakcje

{ public static void main(String[] args) 

{
	
	System.out.println("ZAKUP AKCJI - STYCZEN");
	

	
	int boughtStock = 1000;
	
	double priceForOneboughtStock = 27.95;

	double priceForAllboughtStock = boughtStock * priceForOneboughtStock;
	System.out.println("Cena za wszyskie kupione akcje(PLN): " + priceForAllboughtStock); 
	
	double commission = 0.02;
	
	double commissionFromboughtStock = priceForAllboughtStock * commission;
	System.out.println("Prowizja za kupione akcje(PLN): " + commissionFromboughtStock); 
	
	System.out.println("");
	System.out.println("SPRZEDAZ AKCJI - LUTY");
	
	
	int selledStock = 1000;
	
	double priceForselledStock = 34.08;
	
	double priceForAllselledStock = selledStock * priceForselledStock;
	System.out.println("Cena za wszyskie sprzedane akcje(PLN): " + priceForAllselledStock); 
	
	double commissionFromselledStock = priceForAllselledStock * commission;
	System.out.println("Prowizja za sprzedane akcje(PLN): " + commissionFromselledStock); 
	
	
	System.out.println("");

	double profit = (priceForAllselledStock - commissionFromboughtStock) - commissionFromselledStock; 
	System.out.println("Zysk klienta(PLN): " + profit);



}		 
	
}