
public class 리턴 {

	public static void main(String[] args) {		// void: 값을 반환하지 않음

		int result;
		result = adder(4, 5);
		
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));
	}

	public static int adder(int num1, int num2) {	// 리턴값의 타입(int)을 위에 적어줌

		int addResult = num1 + num2;
		return addResult;							// return값 반환
	}

	public static double square(double num) {
		return num * num;
	}
}
