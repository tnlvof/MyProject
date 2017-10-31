package person.model.vo;

public class Person {
	// 클래스 : 자료형이 다른 변수들의 묶음 + 접근제한기능 + 기능
	// oop(객체 지향) : 캡슐화가 원칙임
	//캡슐화 : 필드들은 반드시 비공개 원칙
	//			클래스 밖에서 필드에 직접 접근이 불가능
	//클래스() 안에서 선언되는 자료형이 다른 변수를 멤버변수
	//필드 작성법 : 접근제한자 자료형 변수명 
	public String name;
	private int age;
	private char gender;
	private String phone;
	private String address;
	
	//private 멤버는 해당 클래스 안에서는 접근 가능
	//하지만 해당 클래스 밖에서는 접근이 불가능
	
	//필드값을 처리할 목적으로 하는 메소드를 클래스 안에 작성함
	//일반적으로 메소드는 public 으로 선언함
	
	//메소드 선언 방법 : public [static] 반환자료형 메소드명 ([자료형 변수명, ...]){}
	
	public void setName(String changeName) {
		name = changeName;
	}

	public void setAge(int changeAge) {
		age = changeAge;
	}

	public void setGender(char changeGender) {
		gender = changeGender;
	}

	public void setPhone(String changePhone) {
		phone = changePhone;
	}

	public void setAddress(String changeAddress) {
		address = changeAddress;
	}
	public void personInformation() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.println("phone : " + phone);
		System.out.println("address : " + address);
	}
}
