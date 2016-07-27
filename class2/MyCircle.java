class MyCircle{

	private int iR;
	private float fArea;
	private float fPeri;

	public MyCircle(){
	}

	public MyCircle(int iR){
		this.iR = iR;
	}

	public void calcArea(){
		this.fArea = 3.14f*this.iR*this.iR;
	}

	public void calcPeri(){
		this.fPeri = 2*3.14f*iR;
	}

	public float getFArea(){
		return this.fArea;
	}

	public void setFArea(float fArea){
		this.fArea = fArea;
	}

	public float getFPeri(){
		return this.fPeri;
	}

	public void setFPeri(float fPeri){
		this.fPeri = fPeri;
	}

	public int getIR(){
		return this.iR;
	}

	public void setIR(int iR){
		this.iR = iR;
	}
}
