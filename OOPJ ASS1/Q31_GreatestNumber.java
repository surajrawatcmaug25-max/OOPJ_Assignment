import java.util.Scanner;

class Q31_GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int greatest = (num1 > num2) ? num1 : num2;

        System.out.println("Greatest number: " + greatest);
    }
}
