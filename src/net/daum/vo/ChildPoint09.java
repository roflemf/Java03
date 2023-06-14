package net.daum.vo;
import net.daum.model.ParentPoint09; // import 패키지명.자바클래스;

public class ChildPoint09 extends ParentPoint09{
	public static void main(String[] args) {
		ChildPoint09 cp09 = new ChildPoint09();
		
		System.out.println(cp09.a);
		System.out.println(cp09.b);
	}
}
