import java.util.Scanner;

public class DragonWarrior extends Hero implements useDragon{

	private String dragonType;
	Scanner console = new Scanner(System.in);
	DragonWarrior(String name) {
		super(name, 100);
		System.out.println("Please identify your dragon type");
		this.dragonType = console.nextLine();
		super.setShoe("Dragon Shoe");
		super.setWeapon("Sword");
	}
	
	@Override
	public String dragonBreath() {
		// TODO Auto-generated method stub
		return this.dragonType + " Breath!!!";
	}

	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return dragonBreath();
	}

	public String toString() {
		return "I am " + this.dragonType + " Dragon Warrior" + "\n" + super.toString();
	}
}
