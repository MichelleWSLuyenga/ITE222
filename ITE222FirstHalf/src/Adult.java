
public class Adult extends Human{
	private String job;

	Adult(String name, int age, int height, int weight, String hairColor, String eyeColor) {
		super(name, age, height, weight, hairColor, eyeColor);
		// TODO Auto-generated constructor stub
	}
	
	public void haveChild() {
		
	}

	public void setJob(String j) {
		this.job = j;
	}
	public String getJob() {
		return this.job;
	}
	
	public String toString() {
		return super.toString() + this.job;
	}
}
