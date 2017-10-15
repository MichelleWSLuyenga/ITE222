
public class Car {
    //color, brand, model, year, currentSpeed
	private String color;
	private String brand;
	private String model;
	private int year;
	private int currentSpeed = 0;
	
	/*public Car(String c, String b, String m, int y) {
		this.color = c;
		this.brand = b;
		this.model = m;
	}
	
	public Car(String c, String b) {
		this.color = c;
		this.brand = b;
	}*/
	
	public void setColor(String c) {		
			this.color = c;	
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setBrand(String b) {
		this.brand = b;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setModel(String a) {
		this.model = a;
	}
	
	public String getModel() {
		return this.model;
	} 
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int setYear() {
		return this.year;
	}
	
	public void accelerates(int speed) {
		
			currentSpeed++;
		
	}
	
    public void decelerates() {
		
	}
    
    public void getCurrentSpeed() {
	    System.out.println(currentSpeed);	
	}
    
    public String toString() {
    	return "Car is " + this.color;
    }
    
    
    
    
}
