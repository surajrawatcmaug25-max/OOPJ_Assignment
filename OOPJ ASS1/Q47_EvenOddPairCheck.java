import java.util.Scanner;

class Q47_EvenOddPairCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        String result = (num1 % 2 == 0 && num2 % 2 == 0) ? "Both numbers are even"
                      : (num1 % 2 != 0 && num2 % 2 != 0) ? "Both numbers are odd"
                      : "Numbers are mixed (one even, one odd)";

        System.out.println(result);
    }
}