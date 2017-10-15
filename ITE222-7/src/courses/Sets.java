package courses;

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		
		//create console for user input
		Scanner console = new Scanner(System.in);
		//create a hash map variable
		Map<String,Integer> myword = new HashMap<String,Integer>();
		//Initialize the string input to run the loop
		String input = "";
		//run the loop while input is not -1
		while (!input.equals("-1"))
		{
			//let user enter the words list
			System.out.print("Please enter your words to count for word(-1 to exit):");
			input = console.nextLine();
			//if the input is not -1 do the count
			if (!input.equals("-1"))
			{
				// split the word using " "
				String[] words = input.split(" ");
				// for each loop with the array to get all the items
				for (String word : words){
					//lower the case of the text
					word = word.toLowerCase();
					//if the word is there then count +1
					if (myword.containsKey(word))
					{myword.put(word, myword.get(word)+1);}
					//if there is no word then add the new word
					else
					{myword.put(word, 1);}
				}
				//use for each loop to print out all item in the list
				for (String name: myword.keySet()) 
				{ System.out.println(name + " count is " + myword.get(name));}
			}
		}
		// Program end!
		System.out.println("Thank you for using the program!");
	}

}
