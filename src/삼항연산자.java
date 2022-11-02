
public class 삼항연산자 {
	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		
		int big;
		
		big = (num1 > num2) ? num1 : num2;			// 참이면 num1 거짓이면 num2 출력
		System.out.println("큰수 "+ big);
		
		
		// num1 num2의 차이의 절댓값을 구하는 프로그램
		
		big = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		
		
		// 절댓값 if문으로 구하기
		if ((num1 - num2) > 0) {
			System.out.println(num1 - num2);
		} else {
			System.out.println(-(num1 - num2));
		}
		
	}
}
