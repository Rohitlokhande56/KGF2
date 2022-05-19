package logical_progarms;

import java.util.Scanner;

public class palindrome_no {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter a no.");
		
		//int no=s.nextInt();
		int no=151;
		int temp=no; //saved original no
		int rev=0,rem;
		
		
		while(temp !=0){ //temp no. not equal to zero
			
			rem=temp % 10; //remineder calculating
			rev=rev*10+rem; //reverse no
			temp=temp/10; //divide main no
		}
    if(no==rev) {
    	System.out.println("it is palidrome no");
    }
    else {
    	System.out.println("it is not palidrome no");
    }
	}

}
