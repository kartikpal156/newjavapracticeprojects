package newjavaproject;

public class innerClassAssisted2 {
		private String msg="Inner Classes";
		void display() {
				class Inner{
						void msg() {
							System.out.println(msg);
						}
				}
				Inner I =new Inner();
				I.msg();
		}
		public static void main(String[] args) {
			innerClassAssisted2 ob =new innerClassAssisted2();
			ob.display();
		}
}
