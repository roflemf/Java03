class Point17 extends Object{
	int x = 10;
	int y = 20;
	
	// 부모클래스 생성자가 오버로딩이 되면 매개변수가 없는 기본생성자를 묵시적 제공하지 않는다.
	
	Point17(int x, int y){
//		super();가 생략됨. 최고조상 Object의 기본생성자를 호출
		this.x =x;
		this.y =y;
		
	}
	
	
}

class ChildPoint17 extends Point17{
	int z = 30;
	
	ChildPoint17(){
		this(100,200,300); //상속과 관련이 없고, 같은 클래스 내의 오버로딩 된 다른 생성자를 호출
	}
	
	ChildPoint17(int x, int y, int z){
		super(x, y); //부모의 오버로딩 된 생성자 호출 경로로 변경
		this.z = z;
	}
	
	void print() {
		System.out.println("x="+x);// x, y멤버변수는 부모로부터 상속받아서 호출
		System.out.println("y="+y);
		System.out.println("z="+z);
	}
}

public class ExtendEx17 {
	public static void main(String[] args) {
		new ChildPoint17().print();
		
	}

}
