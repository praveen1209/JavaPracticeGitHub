package javaLearing;

public class programer extends Employe {

	private float salary;
	
	public programer(int customerid, float salary){
		super(customerid);
		salary= this.salary;
	}
	
	/*public static void main(String[] args) {
		programer prg = new programer( 2000, 10);
		
		System.out.println(" programer id -----> "+prg.getId());
		System.out.println(" programer salary------>"+prg.getsalary());
	}*/
	public float getsalary(){
		return salary;
	}
}
