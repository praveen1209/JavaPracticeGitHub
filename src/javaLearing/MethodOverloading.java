package javaLearing;

public class MethodOverloading {

	private int num1;
	private float num2;

	public void display(int num1,float num2){
		System.out.println(" IN FRIST METHOD");
	}
	public void display( float num2, int num1){
		System.out.println(" in second method");
	}
	public static void main(String[] args) {
		
		MethodOverloading old= new MethodOverloading();
		old.display(12, 20.0f);
		
		MethodOverloading old1= new MethodOverloading();
		old1.display(22.0f, 22);
	}

}
