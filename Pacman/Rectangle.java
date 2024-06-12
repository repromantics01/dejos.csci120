public class Rectangle
{
	private double width;
	private double height;
	private Point location;

	public Rectangle(double x, double y, double width, double height)
	{
		this.location = new Point(x,y);
		this.width = width>=0?width:0;
		this.height = height>=0?height:0;

	}

	public Rectangle(Rectangle r)
	{
		this.location = new Point(r.location.x, r.location.y);
		this.width=r.getWidth();
		this.height=r.getHeight();
	}

	public Point getLocation()
	{
		return this.location;
	} 

	public double getWidth()
	{
		return this.width;
	}

	public double getHeight()
	{
		return this.height;
	}

	public void setLocation(double x, double y)
	{
		this.location = new Point(x,y);
	}

	public void setHeight(double height)
	{
		if(height>=0)
			this.height=height;
	}

	public void setWidth(double width)
	{
		if(width>=0)
			this.width=width;
	}

	public boolean contains(Point p)
	{
		double x = this.location.x;
		double y = this.location.y;	
		return (p.x >= x && p.x <= x+this.width && p.y >= y && p.y <= y+this.height)?true:false;
	}

	public boolean collidesWith(Rectangle rectangle)
	{
		double x = this.location.x;
		double y = this.location.y;
		double rX = rectangle.getLocation().x;
		double rY = rectangle.getLocation().y;

		if(x+width >= rY && y+height >= rY && rX+rectangle.getWidth()>=x && rY+rectangle.getHeight()>=y)
			return true;
		return false;
	}

	@Override
	public String toString()
	{
		return "(" + this.location.x + ", " + this.location.y + ") w: " + this.width + " h: " + this.height;
	}
}