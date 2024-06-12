public class Point
{
	public double x;
	public double y;

	public Point()
	{
		this.x=0;
		this.y=0;
	}

	public Point(Point point)
	{
		this.x=point.x;
		this.y=point.y;
	}

	public Point(double x, double y)
	{
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString()
	{
		return "(" + this.x + ", " + this.y + ")";
	}
}