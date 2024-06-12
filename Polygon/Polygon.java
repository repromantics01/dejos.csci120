import java.util.*;

public class Polygon
{
	private ArrayList<Point> vertices = new ArrayList<>();
	private Point p1;
	private Point p2;
	private Point p3;

	public Polygon()
	{
		this.vertices.add(new Point(0,0));
		this.vertices.add(new Point(1,1));
		this.vertices.add(new Point(1,0));
	}

	public Polygon(Point p1, Point p2, Point p3)
	{
		this.vertices.add(new Point (p1.getX(), p1.getY()));
		this.vertices.add(new Point (p2.getX(), p2.getY()));
		this.vertices.add(new Point (p3.getX(), p3.getY()));
	}

	public double computePerimeter()
	{
		double sum=0;
		for(int i=0; i<vertices.size(); i++)
		{
			Point p1 = vertices.get(i);
			Point p2 = vertices.get((i+1)%vertices.size());
			Line l = new Line(p1, p2);
			sum+=l.computeLength();
		}
		return sum;
	}

	public double computeArea()
	{
		double sum=0;
		for(int i=0; i<vertices.size(); i++)
		{
			Point p1 = vertices.get(i);
			Point p2 = vertices.get((i+1)%vertices.size());
			sum+=(p1.getX()*p2.getY())-(p2.getX()*p1.getY());
		}
		return Math.abs(sum/2);
	}

	public void addVertex(Point p)
	{
		vertices.add(p);
	}

	public boolean removeVertex(Point p)
	{
		for(int i=0; i<this.vertices.size(); i++)
		{
			Point q = vertices.get(i);
			if(p.getX()==q.getX())
			{
				if(p.getY()==q.getY())
				{
					this.vertices.remove(i);
					return true;
				}
			}	
		}
		return false;
	}

	public int getNumberOfSides()
	{
		return vertices.size();
	}

}