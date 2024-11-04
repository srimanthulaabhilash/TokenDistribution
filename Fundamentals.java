package dailyTask;

public class Fundamentals {
//=====>>>>>	what is a class, syntax with example.
//	In Java, a class is a blueprint for creating objects.
//	It defines the attributes (variables) and behaviors (methods) 
//	that objects of the class will have.

	String instance = "ab";// ===>>> instance variable
	// Variables which are declared inside the class but outside of methods,
	// constructors or blocks

	public static void main(String[] args) {
		Fundamentals objvariable = new Fundamentals();//===>>creating object
		System.out.println(objvariable);
		numbers();//==>>method calling which is a static
		swapNumbers();
		int a=5;
		int b = 10;
		int c = a+b;
		int d= a*b;
		int e= a-b;
		int f=a%b;
		
		System.out.println(" Addition :"+c);
		System.out.println("multiply :"+d);
		System.out.println("sub :"+e);
		System.out.println("modules div :"+f);
	
		//==>>swap two numbers
		int x=2 , y=5;
		int temp = x;
		x=y;
		y=temp;
		System.out.println("x :"+y);
		System.out.println("y :"+x);

		
		
	}
	static int swapNumbers() {
		int x=2 , y=5;
		int temp = x;
		x=y;
		y=temp;
		System.out.println("x :"+y);
		System.out.println("y :"+x);

		return 0;
		
	}
	

	

	static int c = 10;
//		===>>>Variables which are declared outside the main method and inside the class by defining
//		as static is known as Static Variables.
	int employe() {
		int id = 01;
		String name = "Abhilash srimanthula";// ===>>local variable
		// ==>Variables which are declared inside the method is known as local variables
		return 0;

	}
//	Primitive data types ==> inbuilt data types
	byte n1 = 9;
	short n2 = 7;
	int n3 = 19;
	long n4=7;
	float n5 = 7;
	double n6=2.5;
	boolean n7 = true;
	char n8 ='j';
//	Non primitive Data types==> user defined data types
	//1)Strings==>> which are defined in java
	//2)Arrays
    //3)Objects
	//4)interface
	
	static int numbers() {//===>>a method is block of code that perform specific task it has (data type ),
//		(method name )and return type
		return 0;					
	}
	
	//===>>  Default constructor it has no return type and data type
		Fundamentals(){
			System.out.println();
		}
	//===>> parameterized constructor
		Fundamentals(String basics ,String standards){
			System.out.println();
		}
		Fundamentals(int  num ,int standards){
			System.out.println();
		}
		Fundamentals(int  num ,String standards){
			System.out.println();
		}
		

	
	
	
	
	

}

//	==>>>>what is the standard to follow for java.
//	Class names: Start with an uppercase letter
//	Variable names: Start with a lowercase letter
//	Method names: Start with a lowercase letter
//	Package names: Use all lowercase
//	Constructors: Use the same name as their class
