import java.util.Scanner;
class Q21_DayOfWeekTernary{
	public static void main(String[] args){
			
			
			Scanner sc = new Scanner(System.in);
        
			System.out.println("Enter month number (1-12): ");
			int month = sc.nextInt();

			String monthName;

			if (month == 1) {
				monthName = "January";
			} else if (month == 2) {
				monthName = "February";
			} else if (month == 3) {
				monthName = "March";
			} else if (month == 4) {
				monthName = "April";
			} else if (month == 5) {
				monthName = "May";
			} else if (month == 6) {
				monthName = "June";
			} else if (month == 7) {
				monthName = "July";
			} else if (month == 8) {
				monthName = "August";
			} else if (month == 9) {
				monthName = "September";
			} else if (month == 10) {
				monthName = "October";
			} else if (month == 11) {
				monthName = "November";
			} else if (month == 12) {
				monthName = "December";
			} else {
				monthName = "Invalid month number";
			}
				
			System.out.println("Month is " + monthName);
			
			
			
			
	}
}