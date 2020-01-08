package co.micol.classArray;

public class MainApp {
	public static void main(String[] args) {

		Friend[] friends = new Friend[8];

		friends[0] = new UnivFriend("홍길동", "010-1111-1111","컴퓨터공학");
		friends[1] = new ComFriend("박기자", "010-2222-2222","사회부");
		friends[2] = new UnivFriend("홍길순", "010-1111-1111","경제학");
		friends[3] = new ComFriend("이기자", "010-2222-2222","사회부");
		friends[4] = new UnivFriend("김민수", "010-1111-1111","철학");
		friends[5] = new ComFriend("이예은", "010-2222-2222","경리부");
		friends[6] = new UnivFriend("김정은", "010-1111-1111","북한학");
		friends[7] = new ComFriend("박대표", "010-2222-2222","사장");

		for (int j = 0; j < friends.length; j++) {
			System.out.println(friends[j]);
//			friends[j].toString();

		}

	}

}
