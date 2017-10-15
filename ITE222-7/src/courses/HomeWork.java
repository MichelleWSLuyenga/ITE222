package courses;
import java.io.*;
import java.util.*;

public class HomeWork {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner in = new Scanner(System.in);
		String course = "subjects.txt";
		Scanner input = new Scanner(new File(course));
		
		Map<String, String> courses = new HashMap<String, String>();

			       while(input.hasNextLine()) {
							String line = input.nextLine();
							Scanner word = new Scanner(line);
							String code = word.next(); //.trim()
							String name = "";
							String after = word.next().trim();
							
							while(!after.contains("Pre:") && word.hasNext()) {
								name += after + " ";
								after = word.next().trim();
							}
							courses.put(code, name);
			       }
			       System.out.println("Please enter course id to see description (-1 to exit)");
			       String code = "0";
			       
			       do{
			    	   System.out.println("CourseCode: ");
			    	   code = in.nextLine();
			    	   if(courses.containsKey(code)) {
			    		   System.out.println(courses.get(code));
			    	   }else if(code.trim().equals("-1")) {
			    		   break;
			    	   }else
			    		   System.out.println("There are no such code");
			       }while(!code.trim().equals("-1"));
			       System.out.println("Done");
			
	}
}

