
public class Constants {
	public static void main(String[] args) {
		
		// 반지름이 10인 원의 넓이를 구하는 프로그램을 짜시오.
		double radius = 10;
		final double PI = 3.14;
		double area = PI * radius * radius;		// 선언 안 하고 Math.PI라고 해도 됨
		System.out.println("원의 넓이는 "+area);
		
		
		final int MAX_SIZE = 100;				// final 선언은 대문자
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		
		CONST_ASSIGNED = 12;	// 할당하지 않았던 상수의 값 할당
		
		System.out.println("상수1: "+ MAX_SIZE);
		System.out.println("상수2: "+ CONST_CHAR);
		System.out.println("상수3: "+ CONST_ASSIGNED);
	}
}


	// 초기화: 변수선언 후 처음으로 값을 넣는 것

	// final 선언(상수 선언) 후 변수는 항상 대문자로 쓴다. 합성어일때는 _를 넣음
	// class명일때 합성어는 ConstantMax (카멜)