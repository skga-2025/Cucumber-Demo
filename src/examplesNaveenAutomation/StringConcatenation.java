package examplesNaveenAutomation;

import java.util.Scanner;

public class StringConcatenation {
	
	/* Example String concatenation and difference between
	 * println and print
	 * and different comparable operators
	 */
public static void myMethod(){
	
	int a=10;
	int b=20;
	String x="Hello";
	String y="Karthikeyan";
			
	
	System.out.println(a+b+x+y);
	System.out.println(x+y+a+b);
	
	System.out.println(a+b+x+y+a+b);
	
	System.out.println("value of a="+a);
	System.out.println("value of b="+b);
	
	System.out.println("Say"+ " "+x+"to"+y);
	
	System.out.print("Welcome");
	System.out.println("Karthikeyan");
	
}

public static void findHigeshtvalue() {
	
	int a=0,b=0,c=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first value");
	a=sc.nextInt();
	//Thread.sleep(2000);
	System.out.println("Enter the second value");
	b=sc.nextInt();
	//Thread.sleep(2000);
	System.out.println("Enter the third value");
	c=sc.nextInt();
	//Thread.sleep(2000);
	sc.close();
	
	if(a>b & a>c){
		System.out.println(a+" is the highest value");
	}else if(b>c){
		System.out.println(b+" is the highest value");
	}else{
		System.out.println(c+" is the highest value");
	}
	
}
public static void main(String[] args) {
	
//StringConcatenation.myMethod();
	StringConcatenation.findHigeshtvalue();
}
}
