package newjavaproject;
//method overloading
public class overloadMethod {
		public void area(int b,int h) {
			
			System.out.println("Area of triangle  "+ (0.5*b*h));
			
		}
		public void area(int r) {
			System.out.println("Area of circle  "+(3.14*r*r));
		}
		public static void main(String[] args) {
			overloadMethod ob= new overloadMethod();
			ob.area(10, 12);
			ob.area(5);
		}
}
