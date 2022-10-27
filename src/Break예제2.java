
public class Break예제2 {
	public static void main(String[]args) {
		
		// 1~100 수 중 5의 배수이자 7의 배수인 수를 출력하고, 몇 개인지 출력하시오.
		
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if(((num % 5)!=0) || ((num % 7)!=0)) {
				continue;						// 5와 7의 배수가 아니면, 밑은 건너뛰고 위로 이동
			}
			count++;							// 5와 7의 배수인 경우에만 실행
			System.out.println(num);			// 5와 7의 배수인 경우에만 실행
		}
			System.out.println("개수: "+count);
	}
}
