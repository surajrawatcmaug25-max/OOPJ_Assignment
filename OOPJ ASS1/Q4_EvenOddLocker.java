import java.util.Scanner;
class Q4_EvenOddLocker{
	public static void main(String[] args){
			int lockerNum;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Locker number");
			lockerNum=sc.nextInt();
			if(lockerNum%2==0)
				System.out.println("Even Locker Number");
			else
				System.out.println("Odd Locker Number");
			
	}
}