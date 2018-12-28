package examplesNaveenAutomation;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		/*Two dimentional array having row and column values. It contains multiple rows and columns. 
		But in single array it have only one row and coulumn*/
		
		//Declering Two dimentional array
		
		int a[][]=new int[3][4];
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		//First rwo values
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[0][3]=4;
		//Second row values
		
		a[1][0]=5;
		a[1][1]=6;
		a[1][2]=7;		
		a[1][3]=8;	
		
		//Third row values
	
		a[2][0]=9;
		a[2][1]=1;
		a[2][2]=2;
		a[2][3]=3;
		
		System.out.println(a[2][1]);
		
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a[0].length;col++){
				System.out.print(a[row][col]+"  ");
			}
			System.out.println();
		}
	
	}

}
