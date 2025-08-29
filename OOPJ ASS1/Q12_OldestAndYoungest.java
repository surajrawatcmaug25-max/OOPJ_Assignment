import java.util.Scanner;
import java.util.Arrays;

class Q12_OldestAndYoungest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] age=new int[3];
		
		
		for(int i=0;i<age.length;i++){
			System.out.print("Enter age of friend "+(i+1)+": ");
			age[i]=sc.nextInt();
		}
        int oldest=0,youngest=0;
		for(int i =1;i<age.length;i++){
			if(age[i]>age[oldest])
				oldest=i;
			else if(age[i]<age[youngest])
				youngest=i;
		}
        
		System.out.println("oldest: Friend "+(oldest+1));
		System.out.println("yougest: Friend "+(youngest+1));
    }
}
