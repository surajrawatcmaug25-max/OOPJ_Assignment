import java.util.Scanner;
class Q14_Reverse4digitNum{
	public static void main(String[] args){
			
			int num,rev,temp;
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter 4-digit number: ");
			num=sc.nextInt();
			
			
			while(num>0){
				temp=num%10;
				rev=(rev*10)+temp;
				num=num/10;}
			System.out.println("Reverse: "+rev);
			
			
			
			
	}
}