
public class Car extends Vehicle{
	//thinking about private
	private String color;
	private int speed = 0;
	
	//This is the constructor
	Car(String color){
		super(4);
		this.color = color;
	}
	
	
	public void setColor(String color) {
		this.color = color; //variable from the class
	}
	public String getColor() {
		return this.color;
	}
	
	
	public void addSpeed() { //put out the speed to how much?
		if(this.speed<=100) {
			this.speed += 5;
		}
		else{
			System.out.println("MAx speed is 100.");
		}
	}
	public void minusSpeed() {
		if(this.speed-5 >=0) {
			this.speed -= 5;
		}
		else{
			System.out.println("Car stop");
		}
	}
	
	
	public String toString() {
		return "This car color is " + this.color + ". Speed is " + this.speed +"."
				+ super.toString(); //2string tell how to use it -> override
	}


	
	
}
