package classPart;

public class Student {
	
	private int studentID;
	String studentName;
	String address;
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "μ£Όμ μμ";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
