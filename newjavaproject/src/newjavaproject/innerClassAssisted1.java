package newjavaproject;

public class innerClassAssisted1 {
	private String msg ="welcome to java";
	class Inner{
		void hello() {System.out.println(msg +",Let us start learing Inner classes");}
		}
	public static void main(String[] args) {
		innerClassAssisted1 obj =new innerClassAssisted1();
		innerClassAssisted1.Inner in= obj.new Inner();
		in.hello();
	}

}
