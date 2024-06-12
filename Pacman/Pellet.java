public class Pellet
{
	public int score;
	public boolean isVisible;
	public Rectangle dimension;

	Pellet(double x, double y, double width, double height, int score)
	{
		this.dimension = new Rectangle(x,y,width,height);
		this.score = score;
		this.isVisible = true;
	}

	public Rectangle getDimension()
	{
		Rectangle copyDimension = new Rectangle(dimension.getLocation().x, dimension.getLocation().y, dimension.getWidth(), dimension.getHeight());
		return copyDimension;
	}

	@Override 
	public String toString()
	{
		return "Pellet " + this.dimension;
	}
}
