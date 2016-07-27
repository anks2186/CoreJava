class TestThis{
	public static void main(String args[]){
		ThisIs ob = new ThisIs();
		ob.i = 10;
		ob.j = 10.0f;
		ThisIs ob1 = ob.copy();	
	}	
}
class ThisIs{
	int i;
	float j;

	ThisIs(){
		int i = 0;
		float j = 0.0f;
	}
	ThisIs(int i){
		this.i = i;
	}
	

	ThisIs(float j){
		this.j = j;
	}

	ThisIs(int i, int j){
		this(i);
		this(j);
		System.out.println();
	}

	public ThisIs copyCopy(){
		ThisIs x = this.copy();
		return x;
	}	


	public ThisIs copy(ThisIs ob){
		ThisIs o = new ThisIs();		
		o.i = this.i;
		o.j = this.j;
		return o;
	}	
}
