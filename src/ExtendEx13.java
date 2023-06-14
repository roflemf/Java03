/* 생성자는 상속되지 않는다.
 * 상속관계에서 자손클래스에서 부모클래스의 생성자를 호출하려면 super(); 로 호출하려면 부모의 기본생성자를 호출한다.
 * 항상 부모의 생성자를 호출할 떄에는 생성자{}블록 내에서 첫줄에서 사용.
 */

class Parent13 extends Object{
	protected int x;
	protected int y; 
	
	public Parent13() {
		super(); // 생략 가능함. 부모Object 최고 조상클래스의 기본생성자를 호출하면서 생성자 호출은 끝난다
	}
	
	public Parent13(int x, int y) {
		//super(); 가 생략됌
		this.x = x;
		this.y = y;
	}
}

class Child13 extends Parent13{
	protected int z;
	
	public Child13() {}
	
	public Child13(int x, int y, int z) {
		super(x,y);  // 부모클래스의 오버로딩된 생성자 호출 (항상 첫줄에 먼저 사용해야함!!!!)
		this.z = z;
	}// 전달인자 개수가 다른 생성자 오버로딩
	
	public void pr() {
		System.out.println("x = "+x+",y="+y+",z"+z);
		
		
	}
}
public class ExtendEx13 {
public static void main(String[] args) {
	Child13 ch = new Child13 (10,20,30); // 자손클래스의 전달인자 3개짜리 오버로딩 된 생성자를 호출
	ch.pr();
	
}
}
