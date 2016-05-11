package javaLearing;

public class Triangle {

	private int id;
	public Triangle () {
		id=10;
	}
	public Triangle( int id){
		this.id=id;
		
	}
	public int getid(){
		 return id;
	}
	public static void main(String[] args) {
		
		Triangle tr= new Triangle();
		System.out.println(" Triangle----->"+ tr.getid());
		Triangle ts= new Triangle(1000);
		System.out.println(" Triangle----->"+ts.getid());
	}

}
