package doSomething;
import java.awt.Color;
public abstract class shapes {
	protected Color c; 
	protected int length, width; 
	double area;
	String type;
	
	public abstract double getArea();
	public Color getColor() {
		return c;
	}
	public String getType () {
		return this.type;
	}
	public abstract int getLength();
	public abstract int getWidth();
	public abstract int getRadius();
	
}
