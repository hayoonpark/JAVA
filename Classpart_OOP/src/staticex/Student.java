package staticex;

public class Student {
	
	private static int serialNum = 1000;
	private int studentID;
	String studentName;
	String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "μ£Όμ μμ";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
	
