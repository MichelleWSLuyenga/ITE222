
public abstract class Vehicle {
	protected int wheel;
	private int s;
	public int n;
	
	Vehicle(int wheel) {
		this.wheel = wheel;
	}
	
	public String toString() {
		return "It has " + wheel + " number of wheel";
	}
	
	abstract public void horn(); //each will be behave differently on each sub vehicles
}
