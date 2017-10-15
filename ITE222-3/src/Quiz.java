import java.util.*;
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		double assignment = 0.0, quiz = 0.0, midterm = 0.0, fin = 0.0, attendant = 0.0, grade = 0.0, tgrade, min = 0.0, max = 0.0 ;
		String student;
		
		do {
		System.out.print("Enter student name: ");
		student = console.next();
		System.out.print("Assignment: ");
		assignment = console.nextDouble();
		//grade = assignment*=0.2; 
		System.out.print("Quiz: ");
		quiz = console.nextDouble();
		//grade = quiz*=0.1; 
		System.out.print("Midterm: ");
		midterm = console.nextDouble();
		//grade = midterm*=0.25; 
		System.out.print("Final: ");
		fin = console.nextDouble();
		//grade = fin*=0.35;
		System.out.print("Atetndant: ");
		attendant = console.nextDouble();
		//grade = attendant*=0.1;
		grade = (assignment*0.2)+(quiz*0.1)+(midterm*0.25)+(fin*0.35)+(attendant*0.1);
		
		
		System.out.println("Total grade of " + student + " is " + grade);
		tgrade = grade+=grade;
		}while(student != " ");
		
		tgrade/= student.length();
		System.out.println("Class average " + tgrade);
		
		System.out.println("Least score: " + min);
		
		System.out.println("Least score: " + max);
		
	}

}
