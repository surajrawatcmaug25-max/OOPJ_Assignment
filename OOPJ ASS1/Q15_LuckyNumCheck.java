import java.util.Scanner;
class Q15_LuckyNumCheck{
	public static void main(String[] args){
			
			int num,temp,left2=0,right2=0;
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter 4-digit number: ");
			num=sc.nextInt();
			
			
			while(num>0){
				temp=num%10;
				if(num<=99)
					left2=left2+temp;
				else
					right2=right2+temp;
				num=num/10;
				
				}
			if(left2==right2)
				System.out.println("Lucky Number");
			else 
				System.out.println("Not a lucky number");
			
			
			
	}
}