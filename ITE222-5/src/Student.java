
public abstract class Student {
	
	//private StamfordCourse[] course;
	public String name;
	public int age;
	public int id;
	public String major;
	
	Student(String name, int age, int id,String major) {
		super();
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
    	return "Name: " + name + "\nAge: " + age + "\nId: " + id + "\nMajor: " + major + "\n";
	}
	
	
	
	
	
}
