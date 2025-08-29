import java.util.Scanner;

class Q41_ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
		int num=sc.nextInt();
		int temp=num,sum=0,digit; 
		
		while(temp>0){
			digit=temp%10;
			sum+=(digit*digit*digit);
			temp/=10;
		}
		System.out.println(sum==num?num+" is an Armstrong Number":"Not an armstrong number");
		
        

        
        
    }
}
