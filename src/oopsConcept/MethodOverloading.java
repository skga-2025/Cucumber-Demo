package oopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
	
		//Method Overloading- same method name with different arguments with different data types within a class
		MethodOverloading method=new MethodOverloading();
		//method.sum(1, 2, 3); // it is not recommended way to access the static method by creating object
		MethodOverloading.sum(4, 5, 6); // Static method access by static way
		
		method.sum();
		method.sum(10);
		method.sum(23);
		method.sum(3, 5);
		MethodOverloading.main(4);
		

	}
	public static void main(int a){ // main method overloading - Yes we can 
		
		System.out.println("main method overloade");
		
	}
	public void sum(){
		System.out.println("first Sum method");
	}
	public void sum(int a){ //method overload by single parameter
		System.out.println("method overload by single parameter");
	}
	public void sum(long a){// method overload by different data type.
	System.out.println("Third method overload by different data type");	
	}
	public void sum(int a,int b){ // method overloaded by different number of arguments
		System.out.println("method overloaded by different number of arguments");
		System.out.println(a+b);
	}
	private static void sum(int a,int b, int c){
		System.out.println(a+b+c);
	}
}