
public class Arrow extends Hero implements Bow{

	public Arrow(String name, int health, String weapon, String shoe) {
		super(name, health, weapon, shoe);
		// TODO Auto-generated constructor stub
		
		this.health = 40;
		this.weapon = "Arrow";
		this.shoe = "Boot shoe";
	}

	
	
	
	
	
	
	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return Bow();
	}
	
	
	public String toString() {
		return "I am Arrow!" + "  Name: " + name + "  Health: " + health + "  Weapon: " + weapon + "  Shoe: " + shoe;
	}







	@Override
	public String Bow() {
		// TODO Auto-generated method stub
		return "Arrow attack!!!!!";
	}
	
}
