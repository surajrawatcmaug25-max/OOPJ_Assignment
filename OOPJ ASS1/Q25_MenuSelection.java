import java.util.Scanner;

class Q25_MenuSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1–5): ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            case 5:
                System.out.println("You selected option 5.");
                break;
            default:
                System.out.println("Invalid option. Please enter a number from 1 to 5.");
        }
    }
}