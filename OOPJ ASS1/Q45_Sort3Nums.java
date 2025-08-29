import java.util.Scanner;

class Q45_Sort3Nums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int temp;
		if(num1>num2){
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num1>num3){
			temp=num1;
			num1=num3;
			num3=temp;
		}
		if(num2>num3){
			temp=num2;
			num2=num3;
			num3=temp;
		}
		System.out.println("Ascending order: "+num1+" "+num2+" "+num3);
		

		
		
	
		
		
        

        
        
    }
}
