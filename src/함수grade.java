
public class 함수grade {

	public static void main(String[] args) {

		System.out.println(grade(avg(50, 65, 65)));
		
		System.out.println(getHap(10));
		
		getHapPrint(10);
		
		
	}

	public static char grade(double avg) {
		char ch = ' '; // 초기화

		if (avg >= 90)
			ch = '수';
		else if (avg >= 80)
			ch = '우';
		else if (avg >= 70)
			ch = '미';
		else if (avg >= 60)
			ch = '양';
		else
			ch = '가';

		return ch;
	}

	public static double avg(int kor, int eng, int math) {
		return (kor + eng + math) / 3.0;

	}
	
	public static int getHap(int i) {
		
		int sum = 0;
		for(i=1; i<11; i++) {
		sum = sum +i;
		}
		return sum;

	}
	
	public static void getHapPrint(int num){
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			if(i != num)
				System.out.print(i + "+");
			else
				System.out.print(i + "=");
			sum += i;
		}
		System.out.println(sum);
	}
	
	
	
}
