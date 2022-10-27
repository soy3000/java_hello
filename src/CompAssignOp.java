
public class CompAssignOp {
	public static void main(String[] args) {
		
		char ch ='A';					// char ch = 65; 로 하고 println 하면 A가 나옴. 32는 공백
		short sh = 100;					// int ch = 65;면 println 했을 때 65가 나오겠지만~
		
		int result = ch + sh;			// int 이하 정수들은 다 int로 계산해줌
		
		System.out.println(result);
		
		
		//
		
		float fl = 0.1f;				// float + long 은 float로 연산
		long l = 10L;
		
		float result1 = fl + l;
		System.out.println(result1);
		
		
		//
		
		double pi = 3.14;				//		8비트		4비트				(강제적 형변환)
		int num = (int)pi;				// 큰 거(double)에서 작은 거(int)로 넣을때 (int)이렇게 넣어줘야함
		
		System.out.println(num);		// 소수점이 빠져서 3으로 나옴.
		
		
		
		//
		
		short sh1 = 10;
		short sh2 = 20;
		
											// short sh3 = sh1 + sh2; 이렇게 하면 오류남
		short sh3 = (short)(sh1 + sh2);		// sh1+sh2는 무조건 int로 연산되므로 앞에 (short)를 붙여줌
		System.out.println(sh3);
		
		
		
		//
		
		char ch1 = 'A';
		short sh22 = 1;
		
		char ch3 = (char) (ch1 + sh22);
		System.out.println(ch3);
		
		
		
		//
		
		int a = 3;
		int b = 4;
		
		double c = a/ (double) b;		// double c =a/b; 라고 하면 0.0이 나옴
		System.out.println(c);
		
		
		// double c = (double)(a/b); 하면 a/b부터 계산하기 때문에 0.0이 나옴. int는 소수점이하 X
		// 정수형 데이터 중 하나를 double 형 데이터로 바꾸어 주어, 새로운 double형 변수 c에 담아주는 것이다.
		// double c = (double)a/b; 이렇게 순서를 바꾸어줘도 됨.
		
		
	}
}
