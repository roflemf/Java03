import java.util.Scanner;

/* 원의 넓이 : (반지름)×(반지름)×(원주율) */
public class StEx06 {
	public static void main(String[] args) {
		System.out.println("원의 원주율 값 = " + Math.PI);
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 반지름을 정수 숫자로 입력 >> ");
		int radius = Integer.parseInt(scan.nextLine());
		
		double area = radius*radius*Math.PI;
		System.out.println("반지름이 " + radius + "인 원의 면적 = "+ area);
		
	}
}
