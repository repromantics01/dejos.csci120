import java.util.*;
public class Line
{
	public Point p1;
	public Point p2;

	public Line(Point p1, Point p2)
	{
		this.p1=p1;
		this.p2=p2;
	}

	public Point getMidpoint()
	{
		double xC = ((p1.getX()+p2.getX())/2);
		double yC = ((p1.getY()+p2.getY())/2);

		return new Point(xC,yC);
	}

	public double computeLength()
	{
		return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2));
	}

	public double computeSlope()
	{
		if(p2.getX()-p1.getX()==0)
		{
			return 8;
		}
		else
		{
			return ((double)p2.getY()-p1.getY())/p2.getX()-p1.getX();
		}

	}
}
