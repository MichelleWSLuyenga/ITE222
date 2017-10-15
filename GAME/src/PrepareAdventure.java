import java.util.Scanner;

public class PrepareAdventure {
	//Edit your program in the area below only
	static NPC npc1 = new NPC("Bee-Bee", 20);
	static characters;
	static Magician m1 = new Magician("Hades", 50, "Staff", "Mage shoe" );
	static DragonWarrior d1 = new DragonWarrior("WN1AP", 100, "Sword", "Dragon shoe", "Position");
	static Arrow a1 = new Arrow("Blah", 40, "Bow", "Boot shoe");
	private static Magician characters;
	//End here
	
	public static void main(String[] args) {
		
		//Edit your program in the area below only
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Are you ready for the next adventure?!?!?!?!");
		System.out.println("------------------------------------------------------------------");
		System.out.print("Please identify the character name: ");
		String name = console.next();
		
		System.out.println("\nPlease create your character");
		System.out.println("--------------------------------");
		System.out.println("Press1 for Magician");
		System.out.println("Press2 for Dragon Warrior");
		System.out.println("Press3 for Poison Arrow");
		System.out.println("--------------------------------");
		
		System.out.print("Enter your choice: ");
		int choice = console.nextInt();
		
		if(choice == 1) {
			return characters = m1;	
		}else if(choice == 2) {
			System.out.println(characters[1]);
		}else if(choice == 3) {
			System.out.println(characters[2]);;
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
		//System.out.println(characters.attack());
	}

}