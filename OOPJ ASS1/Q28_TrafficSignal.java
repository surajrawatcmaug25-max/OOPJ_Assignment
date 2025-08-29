import java.util.Scanner;

class Q28_TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic signal (Red, Green, Yellow): ");
        String signal = sc.next();

        switch (signal.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("prepare to stop");
                break;
            default:
                System.out.println("Invalid signal");
        }
    }
}
