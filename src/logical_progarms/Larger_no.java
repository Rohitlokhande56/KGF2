package logical_progarms;

import java.util.Scanner;

public class Larger_no {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first number");
		a=s.nextInt();
		System.out.println("Enter second"+ " number");
		b=s.nextInt();
		System.out.println("Enter third number");
		c=s.nextInt();
		
		if(a>b) {
			System.out.println("Entered number is largest:" +a);

		}
		else if(b>c) {
			System.out.println("Entered number is largest:" +b);
			

		}
		else {
			System.out.println("Entered number is largest:" +c);
		}
		
	}

}
