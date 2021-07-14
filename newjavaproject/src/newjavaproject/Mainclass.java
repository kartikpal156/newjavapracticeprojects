package newjavaproject;

public class Mainclass {
  static int methodone(int i) 
  {
	return methodTwo(i *= 11);
	  
  }
  
  static int methodTwo(int i) 
  {
	return methodThree(i /= 11);
	  
  }
  static int methodThree(int i) 
  {
	return methodFour(i -= 11);
	  
  }
  static int methodFour(int i) 
  {
	return i += 11;
	  
  }
  
  
  public static void main (String []args) {
	  System.out.println(methodone(11));
	
}
  
  
}
