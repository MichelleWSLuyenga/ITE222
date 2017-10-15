
public abstract class Hero extends Character{
	private String weapon;
	private String shoe;
	
	public Hero(String name, int health) {
		super(name, health);
		// TODO Auto-generated constructor stub
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
		return super.toString() + "  Weapon: " + weapon + "  Shoe: " + shoe; 
	}
}
