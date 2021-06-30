package newjavaproject;

public class ThrowsDemo {
	void Division() throws ArithmeticException{
		int a =45,b=0,rs;
		rs = a/b;
		System.out.println("\n\t The result is:" + rs);
	}

	public static void main(String[] args) {
		ThrowsDemo T = new ThrowsDemo();
		try {
			T.Division();
		}catch(ArithmeticException Ex)
		{System.out.println("\n\t Error :"+Ex.getMessage());}
		System.out.println("\n\t End of program");

	}

}
