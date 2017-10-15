import java.util.Scanner;

public class BuildRacer {
	static int a = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("B");
		Car c2 = new Car("W");
		Car input = c1;
		
		Scanner console = new Scanner(System.in);
		int userin = console.nextInt();
		
		if(userin == 1) {input = c1;}
		if(userin == 2) {input = c2;}
		
		/*
		Car c1 = new Car("White");
		Car c2 = new Car("Green");
		
		System.out.println(Car.carcount);
		
		/*Vehicle v1 = new Car("W");
		v1 = new Bike("G");
		
		/*Racer r1 = new Racer("David", 2);
		r1.setCar(0, "Black");
		r1.setCar(1, "Silver");
		
		System.out.println(r1);
		
		Car c1 = new Car("Black");
		Bike b1 = new Bike("Dark blue");
		System.out.println(c1);
		System.out.println(b1);*/
		
	}
	
}
