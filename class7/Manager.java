public class Manager extends Employee{
	private	float sal;
	Manager(String name, int id, float sal){
		super(name,id);
		this.sal = sal;
	}
	public void getDetails(){
		super.getDetails();
		System.out.println(""+this.sal);
	}
}
