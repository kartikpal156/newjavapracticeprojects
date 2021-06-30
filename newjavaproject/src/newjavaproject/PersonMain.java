package newjavaproject;

public class PersonMain {

	public static void main(String[] args) {
		// ClassName Object name = new Classname();
		person nisha = new person();
		
		//john.setName("Ramlal");
		//john.setAge(20);
		//john.setAddress("Mumbai");
		person person2 = new person("Smith",35,"Delhi");
		//person2.setName("kartik");
		//person2.setAge(25);
	//	person2.setAddress("delhi");
		System.out.println("Name =   "+  nisha.getName() +'\n' +" Age= " + nisha.getAge() +'\n' +" Adress = "+ nisha.getAddress()  );
		System.out.println("Name =   "+ person2.getName() +'\n'+"Age=  " + person2.getAge() +'\n'+"Adress =  "+ person2.getAddress() );
	}

}
