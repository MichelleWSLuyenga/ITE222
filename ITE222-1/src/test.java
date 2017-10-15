import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        int star;
        
        do {
            //System.out.println(" ");
            System.out.print("Enter level of pyramid (enter -1 to exit): ");
            star = console.nextInt();
            
            //System.out.print(star + ": ");
            
            if(star != -1) {
                for (int i = 1; i<= star; i++) {
                    for(int j = star; j >= i; j--) {
                        System.out.print(" ");
                     }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                     }
                  System.out.println();
                 }
            }else {
            	System.out.println("Thank you!");
            }      
           }while(star != -1);
             
        }
        
    }


