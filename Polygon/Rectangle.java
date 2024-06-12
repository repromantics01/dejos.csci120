public class Rectangle extends Polygon
{
	public Rectangle(double abscissa1, double abscissa2, double ordinate1, double ordinate2)
	{
		super(new Point(abscissa1, ordinate1), new Point(abscissa2, ordinate2), new Point(abscissa1, ordinate2));
		super.addVertex(new Point(abscissa2, ordinate1));
	}

	public double computeDiagonalLength()
	{
		Line l = new Line((super.vertices(abscissa1, ordinate1)),(super.vertices(abscissa2, ordinate2));
		return l.computeLength();
	}

	public Point getCentroid()
	{

	}
	
}