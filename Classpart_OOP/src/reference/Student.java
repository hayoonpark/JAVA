package reference;

public class Student {

	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {	
		studentID = id;
		studentName = name;
		
		korea = new Subject();	//멤버변수는 생성자에서 초기화 多
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total);
	}
	
		
}
