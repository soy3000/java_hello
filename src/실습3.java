
public class 실습3 {
	public static void main(String[] args) {
		
		getHap(10);
		getHap(20);
		getHap(30);
		getHap(40);
		getHap(50);
		getHap(60);
		getHap(70);
		getHap(80);
		getHap(90);
		getHap(100);
		
	}
	
	public static void getHap(int num) {
		 int sum = 0;
		 
		 for(int i=1; i<=num; i++) {
			 sum+=i;
		 }
		 System.out.println("1부터 " + num + "까지의 합 : " + sum);
	   
	}
}

