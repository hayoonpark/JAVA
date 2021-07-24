package test;

public class ParsonTest {

	public static void main(String[] args) {
		Parson parson = new Parson();
		parson.age = 40;
		parson.name = "James";
		parson.marriage = true;
		parson.numberOfChildren = 3;
		
		System.out.println("나이 : " + parson.age);
		System.out.println("이름 : " + parson.name);
		System.out.println("결혼 여부 : " + parson.marriage);
		System.out.println("자녀 수 : " + parson.numberOfChildren);

	}

}
