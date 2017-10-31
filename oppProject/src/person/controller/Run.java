package person.controller;

import person.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		/*Person p = new Person();
		// p.name("이종수");
		p.setName("이종수");
		p.setAge(26);
		p.setGender('남');
		p.setPhone("010-4903-9066");
		p.setAddress("동작구 노량진동");

		p.personInformation();*/
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("버퍼 ");
		sb.append("테스트");
		System.out.println(sb.toString());
		
		sb.replace(3, 7, "바꾸기");
		System.out.println(sb.toString());
		
		sb.insert(3, "끼워넣기 ");
		System.out.println(sb.toString());
		
	}
}
