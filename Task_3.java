//JAVA PROGRAM TO TAKE CHOICE FROM USER AS AN INPUT AND THEN GIVE THE OUTPUT AS PER USER'S CHOICE

//SWITCH CASE PROGRAM

package My_Captain_Task_3;
import java.util.*;

public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name:-");   //Taking name from user
		String name=sc.next();
		System.out.println("Enter your choice:- \n1-Hi There!!!! \n2-Hey!!!! \n3-Hello!!!!");
		int choice = sc.nextInt();    //taking choice from user
		switch(choice) {
		case 1:System.out.println("You said Hi There!!!! "+name);
		break;
		case 2:System.out.println("You said Hey!!!! " +name);
		break;
		case 3:System.out.println("You said Hello!!!! "+name);
		break;
		default:System.out.println("You have entered an invalid option. \nPlease try again!!!");
		}
		
		sc.close();
		
	}
}
