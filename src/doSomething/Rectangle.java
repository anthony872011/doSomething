package doSomething;
import java.awt.Color;

public class Rectangle extends shapes{
	
	Rectangle (int l, int w, Color c){
		this.length = l;
		this.width = w; 
		this.c = c;
		type = "r";
	}
    @Override
	public double getArea() {
		area = length * width;
		return area;
	}
    public int getLength() {
    	return this.length;
    }
    public int getWidth() {
    	return this.width;
    }
	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}
}
