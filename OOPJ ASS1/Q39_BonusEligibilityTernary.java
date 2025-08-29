import java.util.Scanner;

class Q39_BonusEligibilityTernary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
		double sal=sc.nextDouble();
		System.out.print("Enter years of Service: ");
		int years=sc.nextInt();
		System.out.println(years>5?"Bonus: "+(0.05*sal):"You are not eligible for Bonus");
        

        
        
    }
}
