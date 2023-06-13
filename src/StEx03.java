/* 정적 메소드 내에서 this를 사용할 수 없다
 */


class St03{
	private static int a =10; //정적 변수
	private int b = 20; // 인스턴스 변수
	
	public static void printA() { // 정적메서드
		System.out.println(a);
//		System.out.println(this.b);// 정적메서드 내에서 this를 사용못함   
	}
	
	public void printB() { // 인스턴스 메서드
		System.out.println(a);
		System.out.println(this.a); // this.은 생략이 가능함
	}
}
public class StEx03 {
	public static void main(String[] args) {
	
		
		
	}
}
