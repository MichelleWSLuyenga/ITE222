import java.util.Scanner;

public class AssassinChemist extends Hero implements useChemist{

	private String Chemical;
	Scanner console = new Scanner(System.in);
	
	AssassinChemist(String name) {
		super(name, 100);
		System.out.println("Please identify your chemical");
		this.Chemical = console.nextLine();
		super.setShoe("Assassin Shoe");
		super.setWeapon("Dancing blade");
	}
	
	@Override
	public String ChemistDestruction() {
		// TODO Auto-generated method stub
		return this.Chemical + " Destruction!!!!!!!!";
	}

	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return "Surprise them with " + this.getWeapon() + " then follow by " + ChemistDestruction();
	}

	public String toString() {
		return "I am AssassinChemist!!" + "\n" + super.toString();
	}
}
