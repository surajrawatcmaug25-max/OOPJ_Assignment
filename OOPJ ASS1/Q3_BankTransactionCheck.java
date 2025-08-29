import java.util.Scanner;
class Q3_BankTransactionCheck{
	public static void main(String[] args){
			int ammount;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the transaction ammount");
			ammount=sc.nextInt();
			if(ammount>0)
				System.out.println("deposit transaction");
			else
				System.out.println("Withdrawl transaction");
			
	}
}