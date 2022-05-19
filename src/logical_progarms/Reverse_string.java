package logical_progarms;

public class Reverse_string {

	public static void main(String[] args) {
	String name1="Rohit Lokhande";
	String name2="";
	
	int stringlength=name1.length();
	System.out.println(stringlength);
	
	for(int i=stringlength-1; i>=0 ; i--) {
		name2=name2+name1.charAt(i);
	}
      System.out.println(name2);
	}

}

