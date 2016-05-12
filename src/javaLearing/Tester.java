package javaLearing;

public class Tester  extends Employe {
private float discount;

public Tester( float discount,int customerid){
	super(customerid);
	discount=this.discount;
}
public float getdiscount(){
	return discount;
	
	
}
	public static void main(String[] args) {
programer prg = new programer(02, 2000);
	Tester test= new Tester(20.0f, 100);	
		System.out.println(" programer details");
		System.out.println("customer id:"+prg.getId());
		System.out.println("salary:"+prg.getsalary());
System.out.println(" Tester"+test.getdiscount());
System.out.println(" Tester"+test.getId());
	}

}