import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int mat, first;
		int num = 0; 
		
		System.out.print("Enter the first number: ");
		first =  console.nextInt();
		
		do {
		System.out.print(" \"1\" to add \"2\" to minus \"-1\" to exit: ");
		mat = console.nextInt();
		
		switch(mat) {
		case 1:
			System.out.print("Enter number to add the value: ");
			num = console.nextInt();
			num = first+=num;
			System.out.println("Your result is currently is " + num);
			break;
		case 2:
			System.out.print("Enter number to minus the value: ");
			num = console.nextInt();
			num = first-=num;
			System.out.println("Your result is currently is " + num);
			break;
		default:
			System.out.println("Your result is currently is " + num);
			break;
		}
		
		}while(mat != -1);		
		
	}
	

}
