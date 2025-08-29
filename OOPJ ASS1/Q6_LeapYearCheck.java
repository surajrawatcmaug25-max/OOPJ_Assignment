import java.util.Scanner;
class Q6_LeapYearCheck{
	public static void main(String[] args){
			int year;
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter year:");
			year=sc.nextInt();
			
			if((year%4==0 && year%100!=0) || year%400==0 )
				System.out.println(year+" is a Leap Year");
			else
				System.out.println(year+" is not a Leap Year");
			
	}
}