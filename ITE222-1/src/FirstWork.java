import java.util.Scanner;
public class FirstWork {
    public static void main(String[] args) {
    	//TODO Auto-generated method stub
    	Scanner console = new Scanner(System.in);
    	String name = "";
    	
    	do {
    	System.out.println("Good Morning what is your name?");
    name =  console.nextLine();
    	
    	    if(!(name.equals("Hades"))) {
    		   System.out.println("Hi " + name + ". You are not Hades");
      	}
    }while(!(name.equals("Hades")));
    
    	
    System.out.println("What is your gpa?");
    double gpa = console.nextDouble();
    gpa = console.nextDouble();
    
    
    //System.out.println(name);
    if(gpa > 3.5) {
    	System.out.println("Good job your GPA is " + gpa);
    }
    else if(gpa > 2.5) {
    	System.out.println("You should work harder" + gpa);
    }
    else if(gpa > 0) {
    	System.out.println("You should work harder" + gpa);
    }
    else {
    	System.out.println("Error");
    }
    
    
    int choose = 0;
    while(choose != -1) {
    System.out.println("1 - reprint GPA \n2 - reprint Name\n-1 - Exit");
    choose = console.nextInt();
    
    switch(choose) {
    case 1:
    	System.out.println("Your GPA is " + gpa);
    	break;
    case 2:
    	System.out.println("Your name is " + name);
    	break;
    case -1:
    	System.out.println("");
    	break;
    
    }
    }
   
    
    
    
    
    
    }
}
