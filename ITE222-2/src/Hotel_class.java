
public class Hotel_class {
	public String name;
	public int rating;
	public int max_room;
	private int booking = 0;
	
	public void make_booking(int booking_no){
		if(booking_no<=max_room-booking){			
			this.booking = booking_no;			
			System.out.println("Your booking for "+booking_no+" room(s) is complete. There are "+(max_room-booking)+" room(s) left.");
		}else{
			System.out.println("You are tring to book "+booking_no+" room(s) but there not enough room available, there are "+(max_room-booking)+" room(s) left.");
		}
	}
	public void cancle_booking(int booking_no){
		if(booking_no<=booking){
			booking -= booking_no;
			System.out.println("Your cancelation of "+booking_no+" room(s) is complete.");
		}else{
			System.out.println("You are tring to cancel "+booking_no+" room(s) but there are only "+booking+" room(s) has been book.");
		}
	}
	public void CheckAvaliability(){
		System.out.println(name+", a "+rating+" star hotel, has "+max_room+" rooms. There are "+(max_room-booking)+" left.");
	}
	

}