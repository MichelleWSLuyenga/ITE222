
public class NPC extends Character{

	public NPC(String name, int health) {
		super(name, health);
		// TODO Auto-generated constructor stub
	}
	
	public String giveQuest() {
		return "Please finish your programming quest";
	}
	
	public String toString() {
		//return "I am NPC " + name;
		return "I am NPC " + super.name;
	}

}
