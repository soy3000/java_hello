
public class CompAssignOp2 {
	public static void main(String[] args) {
		
		short num = 10;
		num = (short) (num+77L);			// num+77L은 long이 되므로 (87L) -> short로 형변환
		int rate = 3;
		rate = (int)(rate * 3.5);			// rate*3.5는 double -> int로 형변환
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L;							// 복합대입연산자(+=)에서는 형변환이 필요하지 않다.
		rate = 3;
		rate *= 3.5;
		
		System.out.println(num);
		System.out.println(rate);
		
		
		//
		
		System.out.println("7.0 == 7 : " + (7.0 == 7));
		System.out.println("7.0 != 7 : " + (7.0 != 7));
		
	}
}
