package oopsConcept;

public class StaticNonStaticMethod {
	
	//Global variables declered outside the main method
	String name="Karthikeyan";
	static int age=28;

	public static void main(String[] args) {
		
		//Calling a static method in two ways
		//directly calling
		sub();
		// calling by class name
		StaticNonStaticMethod.sub();
		
		// calling a static variable
		System.out.println(StaticNonStaticMethod.age);
		System.out.println(age);
		//System.out.println(name); unable to call the non static variable in main method.. throwing error.
		
		// calling a non static variable and method
		
		StaticNonStaticMethod obj= new StaticNonStaticMethod();
		obj.sum();
		System.out.println(obj.name);
		

	}

	public void sum(){
		System.out.println("Non Static method");
	}
	
	public static void sub() {
		
		System.out.println("Static method");
		
	}
}
