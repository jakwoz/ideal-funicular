public class owoceBadania

{ public static void main(String[] args) 

{
	int clients = 31453;
	
	int onceaWeek = (int) (clients * 0.38);
	System.out.println("Liczba osob kupujaca owoce conajmniej raz w tygodniu: " + onceaWeek);
	
	System.out.println("");
	
	int citrusFruits = (int) (onceaWeek * 0.63);
	System.out.println("Liczba osob kupujaca tylko owoce cytrusowe conajmniej raz w tygodniu: " + citrusFruits);
	
	System.out.println("");
	
	int nationalFruits = (int) (onceaWeek * 0.25)  ;
	System.out.println("Liczba osob kupujaca owoce tylko pochodzenia krajowego conajmniej raz w tygodniu: " + nationalFruits);
	
	System.out.println("");
	
	int notNationalnotCitrus = (onceaWeek - citrusFruits) - nationalFruits; 
	System.out.println("Liczba osob kupujaca owoce conajmniej raz w tygodniu - nie sa to jednak owoce cytrusowe ani owoce pochodzenia krajowego: " + notNationalnotCitrus);

	
	

	
	



}		 
	
}