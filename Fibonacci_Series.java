// Program to print Fibonacci series till the 'n' number which is given by the user

package My_Captain_Task_7;
import java.util.*;
public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :-");
		int n = sc.nextInt();  // Taking input from user
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=1;i<n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;  //Swapping values from b to a
			b=c;  // Swapping values from c to b
		}
		sc.close();
		

	}

}
