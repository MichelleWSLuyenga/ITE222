import java.util.*;

public class lab7 {
	
	private static Scanner con;
		
	public static void main(String[] args) {
		
		String words; 
		do {
			con = new Scanner(System.in);
			System.out.print("Please enter your words to count for word(-1 to exit):  ");
	        words = con.nextLine();
			
	        List<String> list = Arrays.asList(words.split(" "));
		    Set<String> uniqueWords = new TreeSet<String>(list);
		    
		    if(!words.equals("-1")) {
		    	for (String word : uniqueWords) {
			        System.out.println(word + " count is " + Collections.frequency(list, word));
			    }
		    }else if(words.equals("-1")) {
		    	System.out.println("Thank you for using the program!");
		    }
		    		
		}while(!words.equals("-1"));
		
	}
}
