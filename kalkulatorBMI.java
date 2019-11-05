import java.util.Scanner;


public class kalkulatorBMI

{ public static void main(String[] args) 

{
	Scanner klawiatura = new Scanner(System.in);
	
	double weightKG;
	
	
	System.out.print("Wprowadz wage(kg):  ");
	weightKG = klawiatura.nextDouble();
	
	double heightCM;
	
	System.out.print("Wprowadz wzrost(cm):  ");
	heightCM = klawiatura.nextDouble();
	
	
	double bmi = (100*100*weightKG)/(Math.pow(heightCM, 2));
	System.out.println("Twoje BMI wynosi: " + bmi);
	
	
	if ((weightKG>500 && heightCM>250) || (weightKG>500 || heightCM>250))
		System.out.println("Dane nieprawidlowe");
	else
	if	((weightKG<=0 && heightCM<=0) || (weightKG<=0 || heightCM<=0))	
		System.out.println("Dane nieprawidlowe");
	
	else
	if (bmi<18.5) {
		System.out.println("Niedowaga!");
	}

	else if (bmi>=18.5 && bmi < 25) {
		System.out.println("Waga prawidlowa!");
	}
	
	else if (bmi>= 25 && bmi < 30) {
		System.out.println("Nadwaga!");
	}
	
	else if (bmi>=30) {
        System.out.println("Otylosc!");
	}
	

	klawiatura.close();	 
}		 
	
}