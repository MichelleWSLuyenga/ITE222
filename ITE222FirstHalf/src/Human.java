
public abstract class Human {
	private String name;
	private int age;
	private int height;
	private int weight;
	private String hairColor;
	private String eyeColor;
	
	Human(String name, int age, int height, int weight, String hairColor, String eyeColor) {
		super();
	}
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	public int getHeight() {
		return this.height;
	}
	
	public void setWeight(int w) {
		this.weight = w;
	}
	public int getWeight() {
		return this.weight;
	}
	
	public void setHairColor(String hc) {
		this.hairColor = hc;
	}
	public String getHairColor() {
		return this.hairColor;
	}
	
	public void setEyeColor(String ec) {
		this.eyeColor = ec;
	}
	public String getEyeColor() {
		return this.eyeColor;
	}
	
	
	public String toString() {
		return name + " " + age + " " + height + " " + weight + " " + hairColor + " " + eyeColor;
	}
	
	
	
	
	
	
	
	
	
	
}
