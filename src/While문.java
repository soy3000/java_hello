
public class While문 {
	public static void main(String[] args) {
		
		int num = 0;
		while(num < 5) {
			System.out.println("I like Java" + num);
			num++;
		}
	}
}

	// for문이 더 간단함.
	//					반복의 횟수를 세기 위한 변수; 반복의 조건; 반복 조건을 무너뜨리기 위한 연산
	//				for(int num=0; num<5; num++) {
	//				System.out.println("I like Java" + num);
	//				}


			// while문과 do ~ while문의 차이
/*
 * 		do while문은 조건이 끝에 붙기 때문에 무조건 내부 로직을 한 번은 실행하게 된다. 
 * 		while 문은 조건이 앞에 있기 때문에 조건에 맞지 않으면 실행하지 않을 수도 있다.
 */