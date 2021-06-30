package newjavaproject;

public class TypeCastDemo {

	public static void main(String[] args) {
		
		int intVar = 10; // 4 bytes , integral
		// intVar = true
		
		short shortVar = 12; // 2 bytes , integral
		intVar = shortVar;// Implicit Type casting
		
		long longVar = intVar; // Implicit type casting
		float floatVar = intVar; // Implicit type casting, 4 bytes
		
		floatVar = 12.34f;
		intVar = (int)floatVar;  // explicit conversion
		int intData = 10;
		
	}
	
}
