import java.util.Scanner;
class Q2_HighestSalary{
	public static void main(String[] args){

		System.out.print("Enter salary for Companies:");
		Scanner sc=new Scanner(System.in);
		String[] sals=sc.nextLine().split(" ");
		int[] arr=new int[sals.length];
		int j=0;
		for(String i:sals){
			arr[j]=Integer.parseInt(i);
			j++;
		}
		if((arr[0]>arr[1])&&(arr[0]>arr[2]))
			System.out.println("Company 1 offers the highest salary");
		else if(arr	[1]>arr[2])
			System.out.println("Company 2 offers the highest salary");
		else
			System.out.println("Company 3 offers the highest salary");

			
	}
}