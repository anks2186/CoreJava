public class Student {

	String name;
	int id;

	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object ob){
		if(ob instanceof Student){
			Student o = (Student) ob;
			return this.name.equals(o.name) && this.id == o.id;
		}
		return false;
	}
}


