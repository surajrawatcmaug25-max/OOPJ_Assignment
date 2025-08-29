import java.util.Scanner;

public class Q24_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        char grade;

            switch (marks / 10) {
                case 10:
                case 9:
                case 8:
					if(marks>84){
                    grade = 'A';
                    break;
					}
					
                case 7:
					grade = 'B';
						break;
                case 6:
                    
                case 5:
					if(marks>54){
                    grade = 'C';
                    break;
					}
                case 4:
					if(marks>44){
                    grade = 'D';
                    break;
					}
                case 3:
                case 2:
					if(marks>24){
                    grade = 'E';
                    break;
					}
                default:
                    grade = 'F';
            }

            System.out.println("Grade: " + grade);
        

        
    }
}
