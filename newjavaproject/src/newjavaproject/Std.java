package newjavaproject;

//parameterized constructor

public class Std {
			int id;
			String name;
			Std(int i,String n){
				id = i;
				name =n;
			}
			void display() {
				System.out.println(id +" "+ name);
			}
}
