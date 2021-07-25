package thisex;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("이름없음",1);	//다른 생성자를 부를땐 first statement여야한다
							//즉 젤 처음에 나와야한다
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	public Person getSelf() {
		return this;
	}
}
