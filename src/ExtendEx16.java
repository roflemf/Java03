// 상속, 상속에서 생성자 호출문제, super.부모클래스 등에 관한 예제

class Member16{
	private String member_id;
	private String member_pwd;
	private String member_name;
	
	public Member16(String member_id, String member_pwd, String member_name) {
		this.member_id = member_id;
		this.member_pwd = member_pwd;
		this.member_name = member_name;
	}//생성자 오버로딩
	
	public void prMember() {
		System.out.println("아이디 :" +member_id);
		System.out.println("비번 :" +member_pwd);
		System.out.println("회원이름 :" +member_name);
	}
}

class ChildMember16 extends Member16{
	private String member_addr; //주소
	
	public ChildMember16(String member_id, String member_pwd, String member_name, String member_addr) {
		
		super(member_id, member_pwd, member_name);//조상의 오버로딩된 생성자 호출
		this.member_addr = member_addr;
		
		
		
	}
	public void childPrMember() {
		super.prMember();//부모클래스 메서드 호출
		System.out.println("회원주소 : "+member_addr);
	}
	
	
	
}
public class ExtendEx16 {
	public static void main(String[] args) {
		ChildMember16 cm16 = new ChildMember16("kkkkk56789", "99999", "홍길동", "서울시 종로구");
		cm16.childPrMember();
	}

}
