import java.util.Scanner;

class Q48_GradeWithPlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String grade;

        if (marks >= 85 && marks <= 100) {
            grade = "A";
        } else if (marks >= 75 && marks <= 84) {
            grade = "A−";
        } else if (marks >= 65 && marks <= 74) {
            grade = "B+";
        } else if (marks >= 55 && marks <= 64) {
            grade = "B";
        } else if (marks >= 45 && marks <= 54) {
            grade = "C";
        } else if (marks >= 35 && marks <= 44) {
            grade = "D";
        } else if (marks >= 0 && marks < 35) {
            grade = "F";
        } else {
            grade = "Invalid marks";
        }

        System.out.println("Grade: " + grade);
    }
}
