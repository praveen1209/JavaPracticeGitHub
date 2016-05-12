package javaLearing;

public class Fibonacci {

	public static void main(String[] args) {
		{
			int k,a=1,b=1;
			k=0;
			System.out.println("1 1");
			while(k<=1000000000){
				k=a+b;
				System.out.println(k +" ");
				a=b;
				b=k;
				//added comment
				System.out.println("Praveen Line added");
				System.out.println("Praveen Line added2");
				System.out.println("Praveen Line added3");
				System.out.println("Praveen Line added4");
				System.out.println("New Line");

			}
		}
	}

}
