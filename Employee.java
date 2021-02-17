//JAVA PROGRAM TO PRINT THE INFORMATION (NAME,YEAR_OF_JOINING,ADDRESS) OF 'n' EMPLOYEES
// BY CREATING A CLASS NAMED 'Employee'.


package My_Captain_Task_5;
import java.util.Scanner;

public class Employee {
	
	String name;
	String address;
	int year;
	
	public void get() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Name of the Employee : ");
		name = in.next();
		System.out.println("Enter the Year of Joining of the Employee : ");
		year = in.nextInt();
		System.out.println("Enter the Address of the Employee : ");
		address = in.next();
		System.out.println();
		
		
		
	}
	
	public void display() {
		System.out.print(name+"\t");
		System.out.print("\t"+year+"\t");
		System.out.println("\t"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of Employees:- ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		Employee e[] = new Employee[n];
		for (int i=0;i<n;i++) {
			int j=i+1;
			System.out.println("Enter the details of the " + j + " Employee:-");
			e[i] = new Employee();
			e[i].get(); 
			System.out.println();
		}
		System.out.println("Details of the Employees are:-");
		System.out.println("Name \tYear of Joining \tAddress");
		for(int i=0;i<n;i++) {
			e[i].display();
		}

	}

}
