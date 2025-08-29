import java.util.Scanner;

class Q1_GreatestOfTwoScores{
	public static void main(String args[]){
		int score1,score2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter score for test 1: ");
		score1=sc.nextInt();
		System.out.print("Enter score for test 2: ");
		score2=sc.nextInt();
	
		if(score1>score2)
			System.out.println("Test 1 has higher score");
		else 
			System.out.println("Test 2 has higher score");
		
		
	}

}