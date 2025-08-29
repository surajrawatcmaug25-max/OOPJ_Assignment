import java.util.Scanner;
class Q13_ExamEligibilityWithMedical{
	public static void main(String[] args){
			
			int classAttended,totalClass;
			char med;
			
			Scanner sc= new Scanner(System.in);
			System.out.print("Classes held: ");
			totalClass=sc.nextInt();
			System.out.print("Classes attended: ");
			classAttended=sc.nextInt();
			System.out.print("Medical Cause (Y/N): ");
			med=sc.next().charAt(0);
			
			if((classAttended>=(0.75*totalClass))||(med=='Y' || med=='y')){
			
			System.out.println("Student is allowed to sit in the exam");
			}
			else 
				System.out.println("Student is not allowed to sit in the exam");
			
			
			
			
	}
}