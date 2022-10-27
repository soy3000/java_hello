
public class If실습 {
	public static void main(String[] args) {
		
		int kor = 80;
		int math = 90;
		int eng = 40;
		int total;
		double avg;
		
		total = kor + math + eng;
		avg = total / 3.0;
		
		if(avg >= 90) {
			System.out.println("수");
		} else if(avg >= 80) {
			System.out.println("우");
		} else if(avg >= 70) {
			System.out.println("미");
		} else if(avg >= 60) {
			System.out.println("양");
		}  else {
			System.out.println("가");
		}
	}
}
