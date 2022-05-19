package logical_progarms;

import java.util.Scanner;

//formula for 
//    Divident =Divisior*Quotient+Remainder
public class Quotient_rem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
		
		int divident=s.nextInt();
		int divisior=s.nextInt();
		//int divident=50;
		//int divisior=10;
		
		int Quotient=divident/divisior;
		int remainder=(divident % divisior);
	System.out.println("Quotient="+Quotient);	
	System.out.println("Remainder="+remainder);	
	

	}

}
