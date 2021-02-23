// Program to check whether the number entered by the user is Prime or not


package My_Captain_Task_6;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number:-");
		int n = sc.nextInt(); //Taking input from user
		boolean isPrime = true;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("The entered number "+n+" is a prime number.");
		}
		else {
			System.out.println("The entered number "+n+" is not a prime number.");
		}
		sc.close();
		
	}

}
