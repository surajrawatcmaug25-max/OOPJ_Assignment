import java.util.Scanner;

class Q44_PalindromeCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
		int num=sc.nextInt();
		int rev=0,temp=num,digit;
		
		
		while(temp>0){
			digit=temp%10;
			rev=(rev*10)+digit;
			temp/=10;
		}

		System.out.println(rev==num?"Palindrome":"Not a palindrome");
		
		
        

        
        
    }
}
