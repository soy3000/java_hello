
public class 별찍기32 {

	public static void main(String[] args) {

		for(int i=1; i<=4; i++) {
		    for(int j=1; j<4-i+1; j++) {
		       System.out.print(" ");
		    }
		    for(int x=1; x<=i*2-1; x++) {
		       System.out.print("*");
		    }
		    System.out.println();
		
		}
	}
}


