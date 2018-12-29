package basicJavaConcept;

public class VariableExamples {
	
	/*//int num ber;//no white spaces between variable name
	int gameValue=4; //Second word should start with capital letter
	int Gamevalue=8; //variables are case sensitive
	char character='s'; //variable can start with special characters $ and _
	
	//float 9frac=4.4f; // variable should not start with numbers*/
	
	static String var="Haripirya"; //class variable inside the class and it can accessed with in the class
	static int a;  // static keyword is used to access the variables, method without creating a object of class
	static int b;
	
	public static void myMethod(){
		
		String var="Karthikeyan"; //local variable inside a method and it can be accessed from only inside the method. 
		System.out.println(var);
		
}
	public static void main(String args[]){
	
		VariableExamples.myMethod(); //It return the local variable
		System.out.println(VariableExamples.var); //It display the class variable
		
		VariableExamples.a=10; 
		VariableExamples.b=20;
		
		
	}
}
