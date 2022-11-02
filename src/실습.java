
public class 실습 {

	public static void main(String[] args) {
		
		System.out.println(avg(76,80,90));
		System.out.println(sum(76,80,90));
	}
		
		
	public static double avg(int kor, int eng, int math) {
		return (kor + eng + math) / 3.0;
	}
	
	public static int sum (int kor, int eng, int math) {
		return (kor + eng + math);
	}
}

	
/*
 * 국어 76 영어 80 수학 90 의 평균과 총점을 구하시오.
 */