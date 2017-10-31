package classTest;

public class Person {
	//속성 (필드 == 멤버 변수 == 전역 변수)
	String name;
	int age;
	char gender;
	
	//기능 (메소드)
	public void setName(String changeName) {
		name = changeName;
	}
	public void printInformation() {
		System.out.println("이름 : " + name);
	}
	
}
