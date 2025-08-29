
import java.util.Scanner;

class Q46_CharType{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println("It is an alphabet.");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("It is a digit.");
        } else {
            System.out.println("It is a special character.");
        }
		
		
	
		
		
        

        
        
    }
}
