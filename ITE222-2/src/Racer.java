
public class Racer {
	private Car cars = new Car();
	private String name;
	
	public Racer(String name, String c, String b, String a, int y) {
		cars = new Car();
		this.name = name;
		/*cars.setColor(c);  //cars = new Car(c,b,a);
		cars.setBrand(b);
		cars.setModel(a);
		cars.setYear(y);*/
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name + " is driving " + cars.getBrand();
	}
	
	
	
	
	
}
