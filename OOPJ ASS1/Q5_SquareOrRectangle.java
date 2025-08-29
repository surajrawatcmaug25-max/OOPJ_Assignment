import java.util.Scanner;
class Q5_SquareOrRectangle{
	public static void main(String[] args){
			int length,breadth;
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter Length:");
			length=sc.nextInt();
			System.out.print("Enter Breadth:");
			breadth=sc.nextInt();
			if(length==breadth)
				System.out.println("Square Garden");
			else
				System.out.println("Rectangle Garden");
			
	}
}