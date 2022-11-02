
public class 별찍기 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {			// 행
			for(int j=1; j<=i; j++) {		// *의 개수
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
