import java.util.Scanner;

import net.daum.vo.MemberVO;

//MemberVO.java 데이터 저장빈 클래스를 활용하는 예제
public class MemberMain {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("회원 아이디 입력>>");
		String id = scan.nextLine();
		System.out.print("회원 비번 입력>> ");
		String pwd = scan.nextLine();
		System.out.print("회원 이름 입력>> ");
		String name = scan.nextLine();
		System.out.print("회원 폰번호 입력>> ");
		String phone = scan.nextLine();
		System.out.print("회원 이메일 입력>> ");
		String email = scan.nextLine();
		
		MemberVO member = new MemberVO();
		member.setMem_id(id); member.setMem_pwd(pwd); member.setMem_name(name);
		member.setMem_phone(phone); member.setMem_email(email);
		
		System.out.println();
		System.out.println("아이디 : "+ member.getMem_id()+", 비번:" + member.getMem_pwd());
		System.out.println("이름 : "+ member.getMem_name()+", 폰번호:" + member.getMem_phone());
		System.out.println("이메일 : "+ member.getMem_email());
		
	}
}
