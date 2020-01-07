package co.binoo.mainapp;

import java.util.Date;

import co.binoo.lecture01.Member;

public class MainApp {

	public static void main(String[] args) {
		Member member = new Member();
//		Date date = new Date();

//		member.id = "luclay";
//		member.name = "리비누";
//		member.address = "대구광역시";
//		member.eDate = date;
//		member.phone = "01099191060";
		member.setAge(18);
		member.toString();
//		member.toPrint();
	}

}
