
public class StamfordStudent {
	
	private StamfordCourse[] course;
	public String name;
	public int age;
	public int id;
	public String major;
	
	StamfordStudent(int b){
		course = new StamfordCourse[b];
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
	
	
	
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setId(int i) {
		this.id = i;
	}
	public int getId() {
		return this.id;
	}
	
	public void setMajor(String m) {
		this.major = m;
	}
	public String getMajor() {
		return this.major;
	}
	
	
	public String toString() {
		String a = "";
		for(int i = 0; i < course.length; i++){
			a += course[i] + "\n";
		}
		
    	return a + "\n" + "I studied total of " + "20hrs/week (Homework is not included)" + "\n" + "\n" + this.name + " " + this.age + " " + this.id + " " + this.major;
    }
	
	
	
	
}
