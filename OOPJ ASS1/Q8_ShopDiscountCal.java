import java.util.Scanner;
class Q8_ShopDiscountCal{
	public static void main(String[] args){
			double purchaseAmm,finalCost;
			
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter total purchase ammount:");
			purchaseAmm=sc.nextDouble();
			finalCost=purchaseAmm-(0.1*purchaseAmm);
			System.out.println("Final Cost after discount: "+finalCost);
			
			
			
			
	}
}