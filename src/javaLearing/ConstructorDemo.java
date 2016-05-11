package javaLearing;

public class ConstructorDemo {
	
private int id;
public ConstructorDemo(){
	id=1000;
}
	public static void main(String[] args) {
		
		ConstructorDemo cst= new ConstructorDemo();
		cst.setId();
		System.out.println(" ConstructorDemo---->"+ cst.getId());
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}

}
