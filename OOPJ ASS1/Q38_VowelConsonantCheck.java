import java.util.Scanner;

class Q38_VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        
        char c = Character.toLowerCase(ch);

        String result = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                        ? "Vowel" : "Consonant";

        System.out.println(result);
    }
}
