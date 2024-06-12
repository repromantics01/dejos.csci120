import java.util.*;

enum TriangleType
{
	Equilateral, Isosceles, Scalene
}

public class Triangle extends Polygon
{

	private TriangleType type;
	private ArrayList<Point> vertices = new ArrayList<>();
	private ArrayList<Double> lineLength = new ArrayList<>();

	public Triangle()
	{
    	super();
    	setType();
	}

	public Triangle(Point p1, Point p2, Point p3)
	{
		super(p1, p2, p3);
		setType();
	}

	public TriangleType getType()
	{
		return this.type;
	}

	public void setType()
	{
		this.vertices = super.getVertices();
     
       for(int i=0; i<vertices.size();i++)
       {
       	 Point p1 = vertices.get(i);
       	 Point p2 = vertices.get((i+1)%vertices.size());
       	 Line l = new Line(p1,p2);
       	 lineLength.add(l.computeLength());
       }

       double side1 = lineLength.get(0);
       double side2 = lineLength.get(1);
       double side3 = lineLength.get(2);

       if(side1 == side2 && side2 == side3)
       	this.type = TriangleType.Equilateral;
       else if(side1 == side2 || side2 == side3 || side3==side1)
       	this.type = TriangleType.Isosceles;
       else
       	this.type = TriangleType.Scalene;    
	}

	@Override
	public void addVertex(Point p)
	{
		System.out.println("You cannot add another point in a triangle.");
	}

	@Override
	public boolean removeVertex(Point p)
	{
		System.out.println("You cannot remove another point in a triangle.");
		return false;

	}
}