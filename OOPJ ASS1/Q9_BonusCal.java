import java.util.Scanner;
class Q9_BonusCal{
	public static void main(String[] args){
			double salary,bonus;
			int years;
			
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter Salary:");
			salary=sc.nextDouble();
			System.out.print("Enter years of Service: ");
			years=sc.nextInt();
			
			if(years>5){
			bonus=0.05*salary;
			System.out.println("Bonus Ammount: "+bonus);
			}
			else
				System.out.println("You are not eligible for bonus");
			
			
			
			
	}
}