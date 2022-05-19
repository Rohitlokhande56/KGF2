package logical_progarms;

public class Adding_an_integers {
	
	public int a=10;
	static int b=20;
	
	String name="Addition is";
	
	
	void Display() {
		int add=(a+b);
		System.out.println(add);
	}
			

	public static void main(String[] args) {
		
		Adding_an_integers obj=new Adding_an_integers();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.name);
		obj.Display();
		


	}

}
