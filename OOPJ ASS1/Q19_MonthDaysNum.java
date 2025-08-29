import java.util.Scanner;
class Q19_MonthDaysNum{
	public static void main(String[] args){
			
			int month;
			Scanner scanner = new Scanner(System.in);
        
			System.out.print("Enter month number (1-12): ");
			month = scanner.nextInt();
			
			switch (month) {
				case 1, 3, 5, 7, 8, 10, 12:
					System.out.println("31 days");
					break;
				case 4, 6, 9, 11:
					System.out.println("30 days");
					break;
				case 2:
					System.out.println("28 or 29 days");
					break;
				default:
					System.out.println("Invalid month number");
			}
        
			
			
			
			
	}
}