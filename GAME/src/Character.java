
public abstract class Character {
	protected String name;
	protected int health;
	
	public Character(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	
	
	public String toString() {
		return "Name: " + name + "  Health: " + health;
	}
}
