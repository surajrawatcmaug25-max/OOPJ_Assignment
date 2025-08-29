import java.util.Scanner;
class Q10_ExamAttendanceEligibility{
	public static void main(String[] args){
			
			int classAttended,totalClass;
			
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter total classes held: ");
			totalClass=sc.nextInt();
			System.out.print("Enter classes attended: ");
			classAttended=sc.nextInt();
			
			if(classAttended>=(0.75*totalClass)){
			
			System.out.println("Student is allowed to sit in the exam");
			}
			else
				System.out.println("Student is not allowed to sit in the exam");
			
			
			
			
	}
}