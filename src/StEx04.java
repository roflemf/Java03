/* 정적 메서드내에서 인스턴스 변수를 사용할 수 없다. */
class St04{
	private static int a = 100; //정적 변수 (클래스변수)
	private int b = 200; //인스턴스 변수
	
	public static void print() {//정적 메서드
		System.out.println(a);
//		System.out.println(b); // 정적메서드 내에서 인스턴스 변수 사용못함
	}
	
	public void print2() {
		System.out.println(a);
		System.out.println(this.b); // this. 생략 가능함
	}
	
}
public class StEx04 {
	public static void main(String[] args) {
	
		
		
	}
}
