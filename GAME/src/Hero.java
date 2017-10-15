
public abstract class Hero {
	protected String weapon;
	protected String shoe;
	protected String name;
	protected int health;
	
	public Hero(String name, int health, String weapon, String shoe) {
		this.weapon = "none";
		this.shoe = "none";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealth() {
		return this.health;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getWeapon() {
		return this.weapon;
	}
	
	public void setShoe(String shoe) {
		this.shoe = shoe;
	}
	public String getShoe() {
		return this.shoe;
	}
	
	public abstract String attack();
	
	public String toString() {
		return "Name: " + name + "  Health: " + health + "Weapon: " + weapon + "Shoe: " + shoe; 
	}
 }
