
public class 구구단 {
	public static void main(String[] args) {

		// 짝수단만 찍기

		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
				System.out.println();
				continue;
			}
		}
	}
}
