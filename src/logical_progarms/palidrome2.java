package logical_progarms;

import java.util.Scanner;

public class palidrome2 {

	public static void main(String[] args) {
		
		//Scanner s=new Scanner(System.in);
		
		//System.out.println("Enter a no");
		
		int no=121;        //s.nextInt();
		int temp=no;
		int rev=0, rem;
		
		while(temp !=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
 if(rev==no) {
	 System.out.println("its is palidrome no");
 }
 else {
	 System.out.println("its is not palidrome no");
 }
	}

}
