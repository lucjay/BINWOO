package co.lucjay.classArray;

public class CompanyFriends extends Friends {
	String emp;

	public CompanyFriends(String emp) {
		super();
		this.emp = emp;
	}

	public String toString() {
		return "CompanyFriends [name=" + name + ", number=" + number + "emp=" + emp + "]";
	}

}
