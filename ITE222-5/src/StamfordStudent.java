
public class StamfordStudent extends Student implements Studies{
	
	private StamfordCourse[] course;
	
	
	StamfordStudent(String name, int age, int id,String major, int numCourse){
		super(name, age, id, major);
		this.name = name; this.age = age; this.id = id; this.major = major;
		course = new StamfordCourse[numCourse];
	}

	public void setcourse( int indexs, String c, String d, String f, int hours){
		course[indexs] = new StamfordCourse();
		course[indexs].setcourseCode(c);
		course[indexs].setcourseName(d);
		course[indexs].setcourseInstructor(f);
		course[indexs].setstudiesHoursPerWeek(hours);
	}
	public StamfordCourse[] getcourse() {
		return course;
	}
	
	
	public String toString() {
		String a = "";
		for(int i = 0; i < course.length; i++){
			a += course[i] + "\n";
		}
		
    	return super.toString() + "\n" + "My courses for this semester are: " + " \n" + a + "I studied total of " + "20hrs/week (Homework is not included)" + "\n";
    }

	@Override
	public String whatDoYouStudy(String course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void goToStudy() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
