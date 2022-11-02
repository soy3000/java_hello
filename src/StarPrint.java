
public class StarPrint {
	public static void main(String[] args) {
		starPrint(7);
		starPrint(3);
	}
	public static void starPrint(int num) {
		for(int i=1; i<=num; i++) {					// i 행 = num

			for(int j=num; j>=1; j--) {				// j 열(*)
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			/*
			 * for(int j=1; j<=i; j++) { System.out.print("*"); }
			 */
			System.out.println();
		}

	}
}

