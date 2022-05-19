package logical_progarms;

//import java.util.Scanner;

//we check 7 is prime no. or not
// 1)first we check no is diveded by itself no 
// 2) 7 is devided by 1 and 7 itself
// 3) we check 2,3,4,5,6 no is divisible by 7 or not ....ex 7/3
// 4) we use for loop and value initialise i=2 and check upto (no-1)
public class prime_no {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter a no");
		
     //int no=s.nextInt();
		int no=7;
        int temp=0; //take a variable
   
        
     for(int i=2; i<=no-1;i++) {
    	 //here we check no is divisible or not ....ex 7/2 
    	 if(no %i==0) {
    		 temp=temp+1;//increament in no
    	 }
    	 }
     //here we check whether our value is greater than zero or not
     
    	 if(temp>0) {
    		 System.out.println("not prime no");
    	 }
    	 else {
    		 System.out.println(" a prime no");
    	 } 
    	 
	}
}
	


