
public class 실습2 {

	public static void main(String[] args) {
		System.out.println(getHap(10));

	}
	
	public static int getHap(int i) {

		int sum = 0;
		for(i=1; i<11; i++) {
			sum+=i;
		}
		return sum;
	}
	
	
}
