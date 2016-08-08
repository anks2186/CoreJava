/**
HEAP
====
1000x: EmployeeObj: name=2000x, id=5
2000x: StringObj: "ABC"
3000x: EmployeeObj: name=4000x , id=9
4000x: StringObj: "PQR"

STACK
=====
Main_Stack
-----------
args : null
val : 10
e : 1000x

m1_Stack
--------
ob: 3000x

*/

public class Test{
	public static void main(String args[]){
		int val = 10;
		Employee e = new Employee("ABC",1);
		Test.m1(e);
		System.out.println(e.getId());
	}
	public static void m1(Employee ob){
		ob.setId(5);
		ob = new Employee("PQR",2);
		ob.setId(9);
	}
}
class Employee{
	private String name;
	private int id;
	Employee(String name,int id){
		this.name = name;
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
}


