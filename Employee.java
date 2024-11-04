package dailyTask;

public class Employee {
	String s="ab";
	
String s1=new String();

	
	
	
	
	
	static {
		System.out.println("static block");

	}

	public static void main(String[] args) {
//		System.out.println("main Method");
//		Employee Obj0 = new Employee();
		Employee Obj = new Employee(1016, "Abhilash");
		System.out.println(Obj);
//		Obj.sumof(8, 9);
//    	sumof(3, 8);
//
}

	
//
//	{
//		System.out.println("instance block");
//	}

//	static int sumof(int a, int b) {
//		int c = a + b;
//		System.out.println(c);
//		return 0;
//
//	}
//
	Employee() {
		System.out.println("I am Constructor");
	}
//
////
	Employee(int id, String Name) {
		System.out.println("I am Parameterized Constructor  :"+ id +Name);
	}

}
