import java.util.Scanner;
class Q17_DivisibilityCheck{
	public static void main(String[] args){
			
			int num;
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter a number: ");
			num=sc.nextInt();
			if(num%2==0){
				System.out.println("Divisible by 2");
			}if (num%3==0){
				
				System.out.println("Divisible by 3");
			}if (num%5==0){
				
				System.out.println("Divisible by 5");
			}
					
					
			
			
			
			
	}
}