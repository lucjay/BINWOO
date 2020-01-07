package co.lucjay.classArray;

public class MainApp {

	public static void main(String[] args) {
		Friends[] fAry = new Friends[10];

		fAry[0] = new UnivFriends("ddd", "35454", "ddd");
		fAry[1] = new UnivFriends("ddd", "35454", "ddd");
		fAry[2] = new UnivFriends("ddd", "35454", "ddd");
		fAry[3] = new UnivFriends("ddd", "35454", "ddd");
		fAry[4] = new UnivFriends("ddd", "35454", "ddd");
		fAry[5] = new UnivFriends("ddd", "35454", "ddd");
		fAry[6] = new UnivFriends("ddd", "35454", "ddd");
		fAry[7] = new UnivFriends("ddd", "35454", "ddd");
		fAry[8] = new UnivFriends("ddd", "35454", "ddd");
		fAry[9] = new UnivFriends("ddd", "35454", "ddd");

		for (int a = 0; a < fAry.length; a++) {
//			if(fAry[a].gunun.equals("c"))//구분할떄
			fAry[a].toString();

		}
	}
}
