package javaLearing;

public abstract class  Person {
	private String name;
	private String gender;
	public Person(String name, String gender){
		this.gender= gender;
		this.name= name;
	}

	public abstract void work();
	@Override
	public String toString(){
		return name+" "+ gender;
	}
	 
	 
	 
	
}
