package logical_progarms;

import java.util.Scanner;

//step1 - start
//step2 - enter x,y
//step3 - print x,y
//step4 - x=x+y

//step5 - y=x-y
//step6 - x=x-y
//step7 - end

public class swappingNo {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the value of x and y ");
		int v=68; //(first no.)        //sc.nextInt();
		int c=56;  //(second no)        //sc.nextInt();
		
		System.out.println("Before swapping:" +v + "  " +c);
		v=v+c;  //68+56=  124
		c=v-c;  //124-56=68
		v=v-c;   //124-68=56
		
		System.out.println("After swapping:" +v + "  " +c);
		
			

	}

}
