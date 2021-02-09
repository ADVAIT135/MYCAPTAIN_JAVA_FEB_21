// JAVA PROGRAM TO CONVERT MINUTES INTO NUMBER OF YEARS AND DAYS



package My_Captain_Task_2;
import java.util.*;
public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of minutes:-");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();  //Taking number of minutes as a user input
		int hours=min/60; //Converting minutes to hours
		int days=hours/24; //Converting Hours to days
		int weeks=days/7;  //Converting Days to Weeks
		int years=weeks/52;  //Converting Weeks to Years
		
		if (weeks%52==0) {
			System.out.println(min+" minutes is "+" approximately "+years+" year/years");
		}
		
		if(weeks%52!=0) {
			float b = min;   //Converting minutes to float type
			double y=(b/(52*7*24*60)); //Converting minutes to years
			int x = (min/(52*7*24*60));  //Converting years to int type from double
			double z= y-x;  //Finding the difference between the double value and the int value of years
			double g= z*(52*7); //Finding the number of days using the value of years 
			
			
			System.out.println(min+ " minutes is approximately "+x+" year/years and "+Math.round(g)+" day/days");
	    }
		sc.close();
		

	}

}
