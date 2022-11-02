
public class 메인메소드 {

	public static void main(String[] args) {
		
		System.out.println("프로그램의 시작");
		hiEveryone(12);						// 12를 전달하며 hiEveryone 호출
		hiEveryone(13);						// 13을 전달하며 hiEveryone 호출
		System.out.println("프로그램의 끝");
	}								// 매개변수가 하나인 메소드의 정의
		public static void hiEveryone(int age) {		// hiEveryone - 함수명. ()안 - 파라미터 
		System.out.println("좋은 아침입니다.");				//	파라미터(인자) = 변수 선언
		System.out.println("제 나이는 " + age + "세 입니다.");
		
	}

}


			// void -> 리턴값이 없다는 뜻
			// void 있는 자리에 데이터 타입 9개도 올 수 있음. 리턴값이 있으면 밑에 return을 써줘야함