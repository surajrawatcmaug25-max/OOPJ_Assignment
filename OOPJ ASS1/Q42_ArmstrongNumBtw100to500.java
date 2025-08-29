import java.util.Scanner;

class Q42_ArmstrongNumBtw100to500{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
		
		for(int i=100;i<500;i++){
			int num=i,temp=i,digit,sum=0;
		while(temp>0){
			digit=temp%10;
			sum+=(digit*digit*digit);
			temp/=10;
			
		}
		if(num==sum)
		System.out.println(num);
		}
		
		
		
        

        
        
    }
}
