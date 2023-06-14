import java.util.Scanner;

/* 내장 api 클라스 하위의 내장메서드를 활용하는 예제
 * 
 */
public class StEx05 {
	public static void main(String[] args) {
		/* 문제) 스캐너를 활용해서 두 정수 숫자값을 입력받아서 int 타입 a,b변수에 입력받은 다음 
		 * Math 클래스 하위의 내장메서드를 활용해서 최대값과 최소값을 구하는 프로그램을 작성
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
//		int a, b;
//		System.out.print("정수입력 1 : ");
//		a = sc.nextInt();
//		System.out.print("정수입력 2 : ");
//		b = sc.nextInt();
//		
//		System.out.println();
//		System.out.println("최대값 : " + Math.max(a, b));
//		System.out.println("최소값 : " + Math.min(a, b));
		
		
		System.out.print("첫번째 정수 숫자입력 >> ");
		int a = Integer.parseInt(sc.nextLine());  // nextLine()메서드에 의해서 문자열로 입력받아 정수 숫자로 변경 (문자열은 nextLine()써야함)
						//parseInt() 내장메서드는 입력받은 문자열을 정수 숫자로 변경해줌
		
		System.out.print("두번째 정숫 숫자입력 >> ");
		int b = Integer.parseInt(sc.nextLine());
		
		int result = Math.max(a, b);  // 두 숫자중 최대값, 즉, 더 큰수를 구함
		System.out.println(a+"와(과) "+b+" 중 최대값은? " + result);
		System.out.println(a+"와(과) "+b+" 중 최대값은? " + Math.min(a, b));
		
	}

}
