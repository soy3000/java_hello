
public class ArithOp {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + num1 + num2);		// 앞이 문자열이니까 뒤도 문자열로 맞춰짐
		
		System.out.println("num1 + num2 = " + (num1 + num2));	// ()쳐주면 우선순위가 ()안으로 바뀜.
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
	}
}
