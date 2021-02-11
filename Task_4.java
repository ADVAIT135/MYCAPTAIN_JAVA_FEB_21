//JAVA PROGRAM FOR MATRIX ADDITION AND MATRIX MUTIPLICTAION




package My_Captain_Task_4;

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int m, n, i, j,k,l;   
		Scanner sc=new Scanner(System.in); 
		System.out.println("Please enter the matrices whose number of rows and columns  in first matrix equals number of columns and rows in the second matrix");
		System.out.print("Enter the number of rows for the first matrix: ");   
		//taking row as input  
		m = sc.nextInt();   
		System.out.print("Enter the number of columns for the first matrix: ");   
		//taking column as input  
		n = sc.nextInt();   
		// Declaring the two-dimensional matrix   
		int a[][] = new int[m][n];   
		// Reading the matrix values   
		System.out.println("Enter the elements of the first matrix: ");   
		//loop for row  
		for (i = 0; i < m; i++)   
		//inner for loop for column  
		for (j = 0; j < n; j++)   
		a[i][j] = sc.nextInt();   
		//accessing matrix elements   
		System.out.println("Elements of the first matrix are: ");   
		for (i = 0; i < m; i++)   
		{   
		for (j = 0; j < n; j++)   
		//prints the matrix elements  
		System.out.print(a[i][j] + " ");   
		//throws the cursor to the next line  
		System.out.println();   
		}   
		System.out.print("Enter the number of rows for the second matrix: ");   
		//taking row as input  
		k = sc.nextInt();   
		System.out.print("Enter the number of columns for the second matrix: ");   
		//taking column as input  
		l = sc.nextInt();   
		// Declaring the two-dimensional matrix   
		int b[][] = new int[k][l];   
		// Read the matrix values   
		System.out.println("Enter the elements of the second matrix: ");   
		//loop for row  
		for (i = 0; i < k; i++)   
		//inner for loop for column  
		for (j = 0; j < l; j++)   
		b[i][j] = sc.nextInt();   
		//accessing matrix elements   
		System.out.println("Elements of the second matrix are: ");   
		for (i = 0; i < k; i++)   
		{   
		for (j = 0; j < l; j++) {   
		//prints the matrix elements  
		System.out.print(b[i][j] + " ");   
		//throws the cursor to the next line  
		System.out.println();   
		} 
	
			
		}
		
		//Adding First and Second Matrix
		System.out.println("Addition of matrices is :-");
		for(int x=0;x<m;x++) {
			for(int y=0;y<k;y++) {
				int c =a[x][y]+b[x][y];
				System.out.print(c+" ");
				
			}
			System.out.println();
			
		
		}
		//Multiplication of First and Second Matrix
		
		System.out.println("Multiplication of matrices is :-");
		for(int f=0;f<n;f++) {
			for(int g=0;g<l;g++) {
				int d=a[f][g]*b[f][g];
				System.out.print(d+" ");
				
			}
			System.out.println();

	    }
	}

}


	
		
	    
