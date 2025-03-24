package playing_with_objects;
import java.util.*;
public class circle {
	
	private double radius;
	public circle(double r)
	{
		this.radius=r;
	}
	public double  getradius()
	{
		return radius;
	}
	public void setradius(double r)
	{
		this.radius=r;
	}
	public double area_circle(double r)
	{
		double area=Math.PI*r*r;
	    return area;
	}
	public double area_circumference(double r)
	{
		double circ=2*Math.PI*r;
	    return circ;
	}
}
