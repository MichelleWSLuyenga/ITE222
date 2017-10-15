
public class Racer {
	private String name;
	private Car[] cars;
	private Boolean isDriving = false;
	
	Racer(String name, int noOfCar) {
		this.name =name;
		cars = new Car[noOfCar];
	}
	
	
	public void setCar(int carno,String color) {
		cars[carno] = new Car(color); 
	}
	public String toString() {
		String print = "";
		for(int i = 0; i< cars.length; i++){
			print += cars[i] + "\n";
		}
		return this.name + "\n" + print;
	}
	
	
	private void selectCar(){ //for its own use
		isDriving = true;
		
	}
	public void exitCar() {
		isDriving = false;
	}
	
	
	
}
