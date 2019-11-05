public class zarobekNetto

{ public static void main(String[] args) 

{
	double salaryBrutto = 5182.43;
	System.out.println("Wynagrodzenie brutto: " + salaryBrutto);
	
	double pensionInsurance = (salaryBrutto / 100) * 9.76;
	System.out.println("Skladka na ubezpieczenie emerytalne: " + pensionInsurance);
	
	double disabilityInsurance = (salaryBrutto / 100) * 1.50 ; 
	System.out.println("Skladka na ubezpieczenie rentowe: " + disabilityInsurance);
	
	double sicknessInsurance = (salaryBrutto / 100) * 2.45;
	System.out.println("Skladka na ubezpieczenie chorobowe: " + sicknessInsurance);
	
	double income = ((salaryBrutto - pensionInsurance) - disabilityInsurance) - sicknessInsurance ;
	
	double medicalInsurance = (income / 100) * 9;
	System.out.println("Ubezpieczenie zdrowotne: " + medicalInsurance);
	
	double profit = income - 111.25;
	
	double tax = ((profit / 100) * 18) - 46.33;  
	
	double  medicalInsuranceDeductible = (profit / 100) * 7.5;
	
	double advancePayment = tax - medicalInsuranceDeductible ;
	System.out.println("Zaliczka na podatek dochodowy: " + advancePayment);
	
	double salaryNetto = (((((salaryBrutto - pensionInsurance) - disabilityInsurance) - sicknessInsurance) - medicalInsurance) - advancePayment) ;
	System.out.println("ZAROBEK NETTO: " + salaryNetto);
	
	

	
	



}		 
	
}