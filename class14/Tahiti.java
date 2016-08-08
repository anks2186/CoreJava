public class Tahiti {
	Tahiti t;
	public static void main(String[] args) {
		Tahiti t = new Tahiti();
		Tahiti t2 = t.go(t);
		t2 = null;
		// more code here
	}
	Tahiti go(Tahiti t) {
		Tahiti t1 = new Tahiti(); Tahiti t2 = new Tahiti();
		t1.t = t2; t2.t = t1; t.t = t2;
        	return t1;
	}
}

HEAP
====
1000x: TObj: t=2000x n
2000x: TObj: 5000x n 
3000x: TObj: t=4000x n 
4000x: TObj: 5000x n
5000x: TObj: t=6000x n 
6000x: TObj: 3000x n 

STACK
=====

Main_Stack
----------
t=1000x
t2=null

