import java.util.Scanner;

public class PrepareAdventure {
	
	//Edit your program in the area below only
	static Scanner console = new Scanner(System.in);
	static int choice;
	static Hero characters;
	static NPC npc1 = new NPC("Bee-Bee", 20);
	//End here
	
	public static void main(String[] args) {
		
		//Edit your program in the area below only
		boolean create = true;

		System.out.println("Are you ready for the next adventure?!?!?!?!\n------------------------------------------------------------------");
		System.out.print("Please identify the character name: ");
		String name = console.next();
		
		do {
			
		}while(create == false);
		
		System.out.println("\n\nPlease create your character\n--------------------------------\nPress1 for Magician\nPress2 for Dragon Warrior\nPress3 for Assassin Chemist\n--------------------------------");
		System.out.print("Enter your choice: ");
		int choice = console.nextInt();
		
		if(choice == 1) {
			characters = new Magician(name);
			create = true;
		}else if(choice == 2) {
			characters = new DragonWarrior(name);
			create = true;
		}else if(choice == 3) {
			characters = new AssassinChemist(name);
		}else{
			System.out.println("The character is not exist!");
		}
		
		//End here

		startGame();
	}
	static void startGame(){
		System.out.println("=================Game Start!!=================");
		System.out.println(npc1);
		System.out.println(characters);
		System.out.println(characters.attack());
	}

}