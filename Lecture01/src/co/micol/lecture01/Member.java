package co.micol.lecture01;

import java.util.Date;

public class Member {
	String id;
	String name;
	Date eDate;
	String addr;
	String tel;
	
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	

	public String toString() { // String toString은 retun 필요함
		
		System.out.println("id : " + id+ "나이 : " + age);
		return null;

	}

	public void toPrint() {
		// void 타입이 아니라서 return 없어도 가능
		System.out.print("name : " + name + "eDate : " + eDate + "addr : " + addr + "tel : " + tel);
		System.out.println("===========================");
	}

}
