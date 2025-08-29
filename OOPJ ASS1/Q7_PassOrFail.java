import java.util.Scanner;
class Q7_PassOrFail{
	public static void main(String[] args){
			int marks;
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter marks:");
			marks=sc.nextInt();
			
			if(marks>=35 )
				System.out.println("Student has passed");
			else
				System.out.println("Student has failed");
			
	}
}