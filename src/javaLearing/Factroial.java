package javaLearing;

public class Factroial {
	int fact(int n){
		int result;
		if (n==1)
			return 1;
		if(n==0)
		return 1;
		result= fact(n-1)*n;
		return result;
	}

	public static void main(String[] args) {
		
		Factroial ob= new Factroial();
		System.out.println(" The factiroal of a given number is :"+ob.fact(10));
		System.out.println(" The factiroal of a given number is :"+ob.fact(10));
		System.out.println(" The factiroal of a given number is :"+ob.fact(10));
	}

}
