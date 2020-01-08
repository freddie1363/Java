package co.kim.scope;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String addr;
	private String tel;
	private int grade;

	public Member() {

	}

//	public Member(String id, String pw, String name, String addr, String tel, int grade) { 
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
//		this.addr = addr;
//		this.tel = tel;
//		this.grade = grade;
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
//	public void insert(String id, String pw, String name, String addr, String tel, int grade) {
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
//		this.addr = addr;
//		this.tel = tel;
//		this.grade = grade;
//		
//	}
	

	public String toString() {
		System.out.print(id + " ");
		System.out.print(pw + " ");
		System.out.print(name + " ");
		System.out.print(addr + " ");
		System.out.print(tel + " ");
		System.out.println(grade + " ");
			
		return null;
		
	}

}
