
public class 형변환실습 {
	public static void main(String[] args) {
		
		//국어 영어 수학 점수를 90 70 80으로 넣고 총점과 평균을 구하시오.
		
		int kor, eng, math;
		double avg;
		
		kor = 90;
		eng = 70;
		math = 80;
		
		// avg = (kor + eng + math) / 3.0;					// 3.0 < 소수점으로 쓰면 자동으로 double
		// avg = (kor + eng + math) / (double)3;
		avg = (double)(kor + eng + math) / 3;				// 방법 세 개 중 하나 선택
		
		System.out.println(avg);
	}

}
