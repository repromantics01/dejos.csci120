enum TriangleType
{
	Equilateral, Isosceles, Scalene
}

public class Triangle extends Polygon
{

	private TriangleType type;

	public Triangle()
	{
       super();
	}

	public Triangle(Point p1, Point p2, Point p3)
	{
		super(p1, p2, p3);
	}

	public TriangleType getType()
	{
		return this.type;
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