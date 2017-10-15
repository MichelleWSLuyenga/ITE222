
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StamfordStudent s1 = new StamfordStudent(4);
		s1.setcourse(0, "ITE222", "Programming2", "Apiporn", 4);
		s1.setcourse(1, "ITE368", "Software Testing", "Chaky", 4);
		s1.setcourse(2, "ITE233", "Application Development", "Apiporn", 4);
		s1.setcourse(3, "ENT201", "Innovation and Entrepeneur", "Hans", 4);
		s1.setName("Hades");
		s1.setAge(20);
		s1.setId(216110108);
		s1.setMajor("IT");
		
		System.out.println("My courses for this semester are: ");
		System.out.println(s1);
		
		
	}
}
