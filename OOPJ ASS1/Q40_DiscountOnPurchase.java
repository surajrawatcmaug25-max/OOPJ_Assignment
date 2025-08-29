import java.util.Scanner;

class Q40_DiscountOnPurchase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Purchase ammount: ");
		double ammount=sc.nextDouble();
		
		System.out.println(ammount>1000?"Total cost after discount: "+(ammount-0.1*ammount):"You are not eligible for discount");
        

        
        
    }
}
