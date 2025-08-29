import java.util.Scanner;

class Q43_SumOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
		int num=sc.nextInt();
		int sum=0,digit; 
		
		while(num>0){
			digit=num%10;
			sum+=digit;
			num/=10;
		}
		System.out.println("Sum of the digits: "+sum);
		
        

        
        
    }
}
