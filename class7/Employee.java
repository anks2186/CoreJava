public class Employee{
	private String name;
	private int id;

	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public void getDetails(){
		System.out.println(""+this.name+ " "+ this.id);
	}
}
