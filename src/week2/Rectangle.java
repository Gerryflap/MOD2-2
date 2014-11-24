package week2;

public class Rectangle{
	//@ private invariant length > 0;
	private int length;
	//@ private invariant width > 0;
	private int width;
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;		
	}
	//@ pure;
	public int length(){
		return this.length;
	}
	//@ pure;
	public int width(){
		return this.width;
	}
	//@ pure;
	public int area(){
		return this.length*this.width;
	}
	//@ pure;
	public int perimiter(){
		return 2*(this.length + this.width);
	}
}
