import java.util.Scanner;

public class test1 {
	 public static void main(String[] args) { 
	        Scanner input = new Scanner(System.in); 
	        int num1; 
	        int num2; 
	         
	        System.out.print("Enter the first number:"); 
	        num1 = input.nextInt (); 
	        System.out.print("Enter the second number:"); 
	        num2 = input.nextInt (); 
	         
	        System.out.println(); 
	        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2)); 
	        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2)); 
	        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2)); 
	         
	         
	     
	}
}
