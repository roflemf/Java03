/* 상속관계에서 부모클래스 메서드가 자손클래스에서 오버라이딩을 한 경우 부모의 메서드를 호출하고 싶을 때는 
 * super.메서드(); 를 사용한다. super는 상속관계에서 부모 클래스를 가리키는 참조변수 키워드이다.
 * 
 */
class Parent11{
	int x; 
	int y;
	
	public void pr(int x) {
		this.x = x;
		System.out.println("x=" + x);
	}
	
	public void pr(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x=" + x + ",y="+ y);
	}//상속과 관련없는 메서드 오버로딩(전달인자 개수가 다른 메서드 오버로딩)
}//Parent11 class

class Child11 extends Parent11{
	int c;

	@Override
	public void pr(int x) {
		super.pr(x, 20); // 부모클래스 메서드 호출
	}//메서드 오버라이딩
}// 자손클래스 Child11 class
public class ExtendsEx11 {
	public static void main(String[] args) {
		Child11 ch= new Child11();
		ch.pr(10);
	}

}
