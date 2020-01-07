package co.lucjay.classArray;

public class UnivFriends extends Friends {

	public String major;

	public UnivFriends(String name, String number, String major) {
		super();
		this.name = name;
		this.number = number;
		this.major = major;
	}

	public String toString() {
		System.out.println("UnivFriends [name=" + name + ", number=" + number + "major=" + major + "]");
		return null;

	}

}
