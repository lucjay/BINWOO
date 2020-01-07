package co.binoo.lecture01;

import java.util.Date;

public class Member {
	String id;
	String name;
	Date eDate;
	String address;
	String phone;

	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String toString() {

		System.out.println("ID : " + id + " AGE : " + age);
		return null;
	}

	public void toPrint() {
		System.out.print("name : " + name + "eDate : " + eDate + "address : " + address + "phone : " + phone);
		System.out.println("--------------------------------------");
	}
}
