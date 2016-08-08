class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object ob){
		if(ob instanceof Student){
			Student s2 = (Student)ob;
			return s2.id == this.id && s2.name.equals(this.name);
		}
		return false;
	}
}
public class EqualsDemo{
	public static void main(String args[]){
		Student s1 = new Student(1,"ABC");
		Student s2 = new Student(1,"ABC");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
