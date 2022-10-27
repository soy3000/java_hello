
public class Switch문 {
	public static void main(String[] args) {
		
		int n = 65;
		
		switch(n) {
		case 'A':									// 문자 char라고 선언된게 아니라서 아스키코드 65로 컴파일됨
			System.out.println("Simple Java");
		case 2:
			System.out.println("Funny Java");
			break;									// 걸리면 break까지
		case 3:
			System.out.println("Fantastic Java");
		default:
			System.out.println("The best programming language");
		}
		
		System.out.println("Do you like Java?");
	}
}