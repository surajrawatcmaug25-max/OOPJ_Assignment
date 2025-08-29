import java.util.Scanner;

class Q27_MessageByChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character (A–E): ");
        char option = sc.next().charAt(0);

        switch (option) {
            case 'A':
            case 'a':
                System.out.println("You selected option A.");
                break;
            case 'B':
            case 'b':
                System.out.println("You selected option B.");
                break;
            case 'C':
            case 'c':
                System.out.println("You selected option C.");
                break;
            case 'D':
            case 'd':
                System.out.println("You selected option D.");
                break;
            case 'E':
            case 'e':
                System.out.println("You selected option E.");
                break;
            default:
                System.out.println("Invalid option. Please enter a character from A to E.");
        }
    }
}
