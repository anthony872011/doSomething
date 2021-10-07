package doSomething;
import java.awt.Color;

public class Circle extends shapes {
	Circle(int l,int w, Color c){
		this.length = l;
		this
		.c = c;
		type = "c";
	}
    @Override
	public double getArea() {
		area = Math.PI * (this.length/2) *(this.length/2);
		return this.area;
	}
    public int getRadius() {
    	return this.length;
    }
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
}
