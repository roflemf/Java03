/* 부모클래스와 자손클래스에서 동일 멤버변수가 정의된 경우 부모로 상속받은 멤버변수에 접근하려면 super.변수명으로 접근하고,
 * 자손에서 정의된 멤버변수에 접근하려면 this. 변수명 또는  변수명(this.이 생략됌)으로 접근한다.
 * 
 */




class Parent12{
	int a = 10;
	int b = 20;
	
	void pr() {
		System.out.println("a=" + this.a + ",b" + b);
	}
	
}
class Child12 extends Parent12{
	int a = 40;
	int b = 50;
	int c = 30;
	
	void print() {
		System.out.println("this.a = "+this.a+",b="+b);//this.이 생략됌
		System.out.println("super.a="+super.a+",super.b="+super.b);
		System.out.println("c="+c+",this.c"+this.c);
	}
}
public class ExtendEx12 {
	public static void main(String[] args) {
		Child12 child = new Child12();
		child.print();
		Parent12 ph = new Parent12();
		ph.pr();
	}
	
}
