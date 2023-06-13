
/* 1. static 키워드(예약어)로 정의된 클래스 소속 변수를 정적변수, 즉 클래스 변수라고 한다.
 * 	   정적변수는 해당 클래스로 직접 접근 가능하다
 */

class St01{
	static int a = 10; // 정적변수(클래스 변수)
	int b = 20; // 인스턴스 변수(해당 클래스로 직접 접근 못함. 반드시 객체 생성해서 접근해야한다.)
}
public class StEx01 {
	public static void main(String[] args) {
		System.out.println("St01.a = " + St01.a); // 클래스명.정적변수로 접근
//		System.out.println("St01.b = " + St01.b); // 클래스명.인스턴스 변수명 접근못함
		
		St01 s01 = new St01();
		St01 s02 = new St01();
		
		System.out.println("s01.a=" + s01.a + ", s02.a="+s02.a); // 정적변수는 생성된 객체에 의해서 값을 공유한다.
		System.out.println("s01.b=" + s01.b + ", s02.b="+s02.b); // 인스턴스 변수는 생성된 객체에 의해서 따로 값을 관리. 
																 // 이유; 객체주소가 다르고, 각 객체마다 관리되기 때문.
		s01.a = 100;
		System.out.println("s01.a =" + s01.a + ",s02.a=" + s02.a);// 100,100
		
		
		s01.b = 200;
		System.out.println("s01.b =" + s01.b + ",s02.b=" + s02.b); // 200,20
	}
}
