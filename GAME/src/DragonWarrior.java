
public class DragonWarrior extends Hero implements useDragon{

	private String dragonType;
	
	public DragonWarrior(String name, int health, String weapon, String shoe, String dragonType) {
		super(name, health, weapon, shoe);
		// TODO Auto-generated constructor stub
		this.dragonType = dragonType;
		this.health = 100;
		this.weapon = "Sword";
		this.shoe = "Dragon shoe";
	}

	
	
	
	@Override
	public String useDragon() {
		// TODO Auto-generated method stub
		return dragonType + "  breath!!!";
	}
	
	
	
	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return useDragon();
	}
	
	
	public String toString() {
		return "I am " + dragonType + "  Dragon Warrior!   Name: " + name + "  Health: " + health + "  Weapon: " + weapon + "  Shoe: " + shoe;
	}
	
}
