package doSomething;
import java.awt.Color;

public class Square extends Rectangle{
	Square(int l, int w, Color c) {
		super(l, w, c);
		type = "s";
		// TODO Auto-generated constructor stub
	}
    @Override
	public double getArea() {
		area = length * length;
		return area;
	}
    public int getLength() {
    	return this.length;
    }
    public int getWidth() {
    	return this.width;
    }
}
