
public class 별찍기4 {
	public static void main(String[] args) {

		for(int i=1; i<=7; i++) {	
			if(i % 2==0) 
				continue;
			else {
			for(int j=7; j>=i; j--) {		
				System.out.print("*");
			}
			System.out.print("("+ (8-i) +")");
			System.out.println();
		}
	}
	}		
}