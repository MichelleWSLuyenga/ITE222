

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel_class hotel1 = new Hotel_class();
		
		hotel1.name = "Stamford Bangkok Hotel";
		hotel1.max_room = 15;
		hotel1.rating = 3;
		
		hotel1.CheckAvaliability();
		
		hotel1.make_booking(10);
		hotel1.make_booking(6);
		hotel1.CheckAvaliability();
		hotel1.cancle_booking(20);
		hotel1.cancle_booking(1);
		hotel1.CheckAvaliability();
		
	}

}
