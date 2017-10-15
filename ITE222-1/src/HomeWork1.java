import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
    	int number = 0;
    	
    	do {
        System.out.print("Enter level of pyramid (enter -1 to exit): ");
        number =  console.nextInt();
    	
        if(number != -1) {
		for (int i = 1; i <= number; i++) {
		    for (int j = number; j >= i; j--) {
		         System.out.print(" ");
	        }
		    for(int n = 1; n <= i; n++) {
		     System.out.print("* ");
		    }
		    System.out.println();
		}
        }else {
    		System.out.println("Thank you!");
    	}
		
    	}while(number != -1);
		
		
	}

}
