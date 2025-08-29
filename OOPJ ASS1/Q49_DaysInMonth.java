import java.util.Scanner;

class Q49_DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        int days;

        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        switch (month) {
            case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
                days = 31;
                break;
            case 4:
			case 6:
			case 9: 
			case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear ? 29 : 28;
                break;
            default:
                days = -1;
        }

        if (days == -1) {
            System.out.println("Invalid month number");
        } else {
            System.out.println(days + " days");
        }
    }
}