package javaLearing;

public class FibonacciExample {

	public static void main(String[] args) {
		int febCount= 15;
		int[] feb= new int[febCount];
		feb[0]= 0;
		feb[1]= 1;
		for(int i=2; i<febCount;i++){
			feb[i]= feb[i-1]+feb[i-2];
		}
		for( int i=0; i<febCount;i++){
			System.out.println(feb[i] +" ");
			System.out.println("line 15");

			System.out.println("Line number 17");
		}
	}

}
