
public class Magician extends Hero implements useMagic{

	public Magician(String name, int health, String weapon, String shoe) {
		super(name, health, weapon, shoe);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.health = 50;
		this.weapon = "Staff";
		this.shoe = "Mage shoe";
	}

	
	@Override
	public String useMagic() {
		// TODO Auto-generated method stub
		return "Fireball!!";
	}
	
	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return this.weapon + useMagic();
	}

	
	public String toString() {
		return "I am Magician!  Name: " + name + "  Health: " + health + "  Weapon: " + weapon + "  Shoe: " + shoe;
	}
}
