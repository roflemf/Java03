/* 상속에서 생성자 호출문제에 관한 실습예제 */

class ParentPoint15{//extends Object이 생략됌
	protected int x = 10;
	protected int y = 20;
	
	public ParentPoint15() {
		super();
	}
	
	public ParentPoint15(int x, int y) {
		this.x= x;
		this.y= y;
	}
}

class ChildPoint15 extends ParentPoint15{
	protected int z = 30;
	
	public ChildPoint15() {
		super(100,200); // 부모클래스 오버로딩 된 생성자를 호출
	}
	
	public ChildPoint15(int x, int y, int z) {
		super(); // 부모의 기본생성자 호출. 생략가능
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void pr() {
		System.out.println("x="+this.x); // this.은 생략가능
		System.out.println("y좌표값 =" + y); // x,y 변수는 부모로부터 상속받아서 처리
		System.out.println("z="+z);
	
	}
	
}
public class ExtendEx15 {
	public static void main(String[] args) {
	
		ChildPoint15 cp15 = new ChildPoint15();
		cp15.pr(); 
		ChildPoint15 cp16 = new ChildPoint15(1000,2000,3000);//전달인자 3개짜리 오버로딩 된 생성자 호출
		cp16.pr();
		
	}
}
