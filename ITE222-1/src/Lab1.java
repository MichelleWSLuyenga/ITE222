import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
    	Scanner console = new Scanner(System.in);
    	int number = 0;
    	
    	do {
    	System.out.print("Enter number (-1 to exit):");
    	number =  console.nextInt();
    	
    	if(number != -1) {
    	System.out.print(number + ":  ");
    	}else {
    		System.out.println("Thank you!");
    	}
    	
    	for(int i = 0; i < number; i++) {
    		System.out.print("*");
    	}
    	System.out.println();
    	}while(number != -1);
    	
    }
}
