//클래스 상속
class Point08{//extends Object
	private int x;
	private int y;
	
	//매개변수가 없는 기본생성자 생략
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}//Point08 class

class ChildPoint08 extends Point08{
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}
public class ExtendEx08 {
	public static void main(String[] args) {
		ChildPoint08 child08 = new ChildPoint08();
		
		child08.setX(10);//상속받아서 사용
		child08.setY(20);//상속받아서 사용
		child08.setZ(30);//자신것 사용
		
		System.out.println("x좌표값 ="+child08.getX()+", y좌표값="+child08.getY()+", x좌표값="+child08.getZ());
		
	}
}
