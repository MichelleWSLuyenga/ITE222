import java.util.*;

public class test1 {
	
	private static Scanner con;
	
	public static void main(String[] args) {

		con = new Scanner(System.in);
		System.out.println("Please enter your words to count for word(-1 to exit):  ");
        String para = con.nextLine();
        

	    List<String> list = Arrays.asList(para.split(" "));

	    Set<String> uniqueWords = new HashSet<String>(list);
	    for (String word : uniqueWords) {
	        System.out.println(word + " count is " + Collections.frequency(list, word));
	    }
    }
}
