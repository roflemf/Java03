// 부모클래스 생성자가 오버로딩이 된 경우 
// 기본생성자를 묵시적 제공하지 않는다.
// 이런 경우 자손클래스에서 부모의 기본생성자를 호출하려다가 컴파일 에러가 발생

/* 부모클래스 생성자가 오버로딩이 되어서 자손에서 부모클래스 기본생성자를 호출할때 에러 방지법
 * 1. 부모클래스 기본생성자를 명시적으로 정의
 * 2. 자손클래스에서 부모의 오버로딩 된 생성자를 호출하려고 인위적 경로를 변경.
 * 
 */

class ParentPoint14{ //extend Object 이 생략됌
	protected int a = 10;
	protected int b = 20;
	
//	ParentPoint14(){
//		super(); // 부모Object 최고 조상 클래스 기본생성자를 먼저 호출
//	}// 기본생성자
	
	ParentPoint14(int a, int b){
		super(); 
		this.a = a;
		this.b = b;
		
	}//전달인자 개수가 다른 생성자 오버로딩
}//ParentPoint14 class


class ChildPoint14 extends ParentPoint14{
	protected int c=30;
	
	ChildPoint14(){
		super(); // 생략가능함, 부모클래스 기본생성자를 먼저 호출
	}
	
	ChildPoint14(int a, int b, int c){
//		super();
		super(100, 200); //부모클래스 오버로딩 된 생성자를 호출하려고 인위적 경로를 변경하면 에러를 방지 가능
		this.c = 300;
	}
}
public class ExtendEx14 {

	public static void main(String[] args) {

	}

}
