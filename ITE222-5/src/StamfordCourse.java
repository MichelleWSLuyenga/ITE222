
public class StamfordCourse {
	
		private String courseCode;
		private String courseName;
		private String courseDescription;
		private String courseInstructor;
		private String courseDate;
		private int studentInCourse;
		private int studiesHoursPerWeek;
		
		public void setcourseCode(String c) {		
			this.courseCode = c;	
		}
		public String getcourseCode() {
			return this.courseCode;
		}
		//name
		public void setcourseName(String d) {		
			this.courseName = d;	
		}
		public String getcourseName() {
			return this.courseName;
		}
		//description
		public void setcourseDescription(String e) {		
			this.courseDescription = e;	
		}
		public String getcourseDescription() {
			return this.courseDescription;
		}
		//instructor
		public void setcourseInstructor(String f) {		
			this.courseInstructor = f;	
		}
		public String getcourseInstructor() {
			return this.courseInstructor;
		}
		//date
		public void setcourseDate(String g) {		
			this.courseDate = g;	
		}
		public String getcourseDate() {
			return this.courseDate;
		}
		//in course
		public void setstudentInCourse(int course) {
			this.studentInCourse = course;
		}
		public int setstudentInCourse() {
			return this.studentInCourse;
		}
		//hours/week
		public void setstudiesHoursPerWeek(int hours) {
			this.studiesHoursPerWeek = hours;
		}
		public int setstudiesHoursPerWeek() {
			return this.studiesHoursPerWeek;
		}
		
		public void description(){
			System.out.println(courseCode + " - " + courseName + " with " + courseInstructor + " ("  + studiesHoursPerWeek + "hrs/week)" );
		}
		public String toString(){
			return courseCode + " - " + courseName + " with " + courseInstructor + " ("  + studiesHoursPerWeek + "hrs/week)";
		}
		
}
