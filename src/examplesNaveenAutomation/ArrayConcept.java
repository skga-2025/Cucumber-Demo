package examplesNaveenAutomation;

public class ArrayConcept {
	
	public static void main(String args[]){
		
		
		//Integer array
		
		int a=10;
		int b[]=new int[4]; // declaring a single dimensional array
		
		/* lowest index of array is 0 
		 * highest index of array is index-1   a[1] -  1 is called as index
		 * */
		b[0]=10; // Initialize the array variable b[]
		b[1]=20;
		b[2]=(int) 30.78;
		b[3]=40;
		
	System.out.println(b[2]);
	System.out.println(b[3]);
	//System.out.println(b[5]); throwing ArrayIndexOutOfBoundsException error since the index value is higher than a inxex value
		
	//for printing all values in array use for loop or Enhanced for loop
		
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		System.out.println("Print through Enhanced for loop");
		
		for(int i:b){ // no need to create any condition and increments. create variable with the same data type and print it.
			System.out.println(i);
		}
		
		// double array
		
		double d[]=new double[3];
		d[0]=12.44;
		d[1]=45.34;
		d[2]=23.45;
		
		System.out.println(d[2]);
		
		// char array
		
		char c[]=new char[4];
		c[0]='d';
		c[1]='o';
		c[2]='I';
		c[3]='t';
		
		for(char print:c){
		System.out.print(print);
		}
		
		//String array
		
		String s[]=new String[4];
		s[0]="Karthikeyan";
		s[1]="Gopinath";
		s[3]="Welcome";
		System.out.println("String Array printing");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		
		/*Advantages of Array is we can save multiple values in single variable with same data type
		 * 
		 * Disadvantages:
		 * Array is in fixed length - Static array = Dynamic arrays Arraylist, Hash table
		 * Different data type are not stored in array = Object data type is used for store multiple values
		 * */
				
		Object obj[]=new Object[3];
		obj[0]=23;
		obj[1]="String";
		obj[2]=45.44;
		
		System.out.println(obj[1]);

		for(Object pri:obj){ //Enhanced for loop
			
			System.out.println(pri);
		}
		//Boolean Array
		
		boolean bo[]=new boolean[2];
			bo[0]=true;
			bo[1]=false;
		System.out.println(bo[1]);
		
		//Array can be declared in the below format as well
		
		long[] l=new long[3]; // it is a proffered way
		l[0]=10;
		l[1]=20;
		l[2]=30;
		
		double[] myList = {1.9, 2.9, 3.4, 3.5};
	}
}
