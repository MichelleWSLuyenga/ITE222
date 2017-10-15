package courses;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class PlayingWithIO {

	public static void main(String[] args) throws FileNotFoundException {
		// Console to read user input
		Scanner console = new Scanner(System.in);
		
		//to accept user input
		//String filelo = console.nextLine().trim(); 
		
		//to directly choose the file by string
		String filelo = "subjects.txt";
	
		//Read the file
		Scanner filein = new Scanner(new File(filelo));
		
		//Hash Map to keep the student list
		Map<String,String> courselist = new HashMap<String,String>();
		
		//While file still has something to read
		while(filein.hasNextLine()){
			// Read 1 line at the time
			String getLine = filein.nextLine();
			
			// read the word in the line 
			Scanner word = new Scanner(getLine);
			
			//get the first word
			String CourseCode = word.next().trim();
			
			// create container for description
			String CourseDes = "";
			
			//get the first of description
			String nextword = word.next().trim();
			
			//get the description until it find Pre
			while (!nextword.contains("Pre:") && word.hasNext()){
				// add the word to the description
				CourseDes += nextword + " ";
				// get the next word
				nextword = word.next().trim();
			}
			// put the info in the hash map
			courselist.put(CourseCode, CourseDes);
		}
		// start reading
		System.out.println("Please enter course id to see description (-1 to exit)");
		
		// initialize the course code
		String CourseCode = "0";
		do{	
			
			System.out.print("CourseCode: ");
			// read user input
			CourseCode = console.nextLine();
			// if the key is found then print
			if(courselist.containsKey(CourseCode))
			{
				System.out.println(courselist.get(CourseCode));
			}
			// if it is -1 exit the program
			else if (CourseCode.trim().equals("-1")){
				break;
			}
			// key is not found
			else
				System.out.println("There are no such code");
			
		}while (!CourseCode.trim().equals("-1"));
		System.out.println("Done");
		
	}
}
