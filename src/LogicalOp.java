
public class LogicalOp {
	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		// 변수 num1에 저장된 값이 1과 100 사이의 수인가?
		result = (1 < num1) && (num1 < 100);
		System.out.println("1 초과 100 미만인가? " + result);
		
		
		// 변수 num2에 저장된 값이 2 또는 3의 배수인가?
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 배수인가? " + result);
		
		
		// 변수 num1이 0인가?
		result = !(num1 != 0);
		System.out.println("0인가? " + result);
		
		
		// 77이 짝수이고, 7의 배수이고, 11의 배수인지 판별하는 프로그램을 짜시오.
		
		int num3 = 77;
		
		result = ((num3 % 2) == 0) && ((num3 % 7) == 0) && ((num3 % 11)==0);
		System.out.println("짝수, 7의 배수, 11의 배수인가? " + result);
	
		
		//
		
		int num4 = 0;
		int num5 = 0;
		
		result = ((num4 += 10) < 0) && ((num5 += 10) > 0);
		
		System.out.println("result= " + result);
		System.out.println("num4= " + num4);
		System.out.println("num5= " + num5);
		
		result = ((num4 += 10) > 0) || ((num5 += 10) > 0);
															// or일 때 하나라도 true면 무조건 true
		System.out.println("result = " + result);
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
		
		//
		
		int num6= 7;
		
		System.out.println(++num6);		//8
		System.out.println(++num6);		//9
		
		System.out.println(num6);		//9
		
		//
		
		int num7= 7;
		
		System.out.println(num7++);		//7
		System.out.println(num7++);		//8
		
		System.out.println(num7);		//9
		
	}
}
