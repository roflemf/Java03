/* static 키워드로 정의된 메서드를 "정적 메서드" 또는 "클래스 메서드"라고 한다. 
 * 정적 메서드는 해당 클래스명으로 직접 접근한다.
 * 
 */
class St02{
	private static int a =10; // 정적변수(클래스 변수)
	private int b =20; // 인스턴스 변수   ; 따로관리 ; 값도 다름
	
	public static void setA(int new_a) {
		a = new_a; //정적변수 앞에는 this 못씀 , this; 내자신클래스에 선언된 멤버변수(객체입장)
	}
	
	public static int getA() {
		return a;
	}
}
public class StEx02 {
	public static void main(String[] args) {
		St02.setA(100); // 클래스명. 정적메서드()로 호출
		System.out.println("a="+St02.getA()); 
		
		St02 st01 = new St02();
		St02 st02 = new St02();
		
		st01.setA(1000);
		System.out.println("a="+st02.getA()); // 1000 . 정적메서드는 생성된 객체에 의해서 공유된다.
	}

}
