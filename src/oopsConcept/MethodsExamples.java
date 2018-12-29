package oopsConcept;

public class MethodsExamples {
	
	//private static final char[] a = null;
	String name="Karthikeayn"; //Global variable or class variable or instance variable
	int age=28; // decleared inside the class and outside the method

	public static void main(String[] args) {
		
		//void - it doesnt return any value
		//If we create a object for a class, then all non static variable and non static methods are assigned to object reference
		
		System.out.println("Main method");
		MethodsExamples obj=new MethodsExamples();
		int newAge=obj.age;
		System.out.println(newAge);
		obj.firstMethod();
		String friendName=obj.secondMethod();
		System.out.println(friendName);
		
		int value=obj.thirdMethod(10, 20);
		System.out.println(value);
			
		}
	public void firstMethod(){   // no input no output
		int a=10;  // local variable in firstMethod
		int b=5;
		System.out.println(a);
	}	
	public String secondMethod(){  // no input and output
		double d=34.4;
		String str="Vimal";
		return str;
	}
	
	public int thirdMethod(int a, int b){ // input and output
		int c=a+b;
		return c;
	}
	}

