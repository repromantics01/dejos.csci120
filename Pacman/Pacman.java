public class Pacman
{
	private double stride;
	private static int totalScore;
	private Rectangle dimension;

	public Pacman(double startX, double startY, double width, double height, double stride)
	{
		this.dimension = new Rectangle (startX,startY,width,height);
		this.stride = stride;
		this.totalScore = 0;
	}

	public Rectangle getDimension()
	{
		Rectangle copyDimension = new Rectangle (dimension.getLocation().x, dimension.getLocation().y, dimension.getWidth(), dimension.getHeight());
		return copyDimension;

	}

	public int getTotalScore()
	{
		return this.totalScore;

	}

	public boolean eat (Pellet pellet)
	{
		
		if(pellet.isVisible && pellet.getDimension().collidesWith(this.dimension))
		{
			this.totalScore=this.totalScore+pellet.score;
			pellet.isVisible=false;
			return true;
		}
		else
			return false;


	}

	public void moveUp()
	{
		double newY = this.dimension.getLocation().y - stride;
		this.dimension.setLocation(dimension.getLocation().x,newY);
	}

	public void moveDown()
	{
		double newY = this.dimension.getLocation().y + stride;
		this.dimension.setLocation(dimension.getLocation().x,newY);
	}

	public void moveLeft()
	{
		double newX = this.dimension.getLocation().x - stride;
		this.dimension.setLocation(newX, dimension.getLocation().y);
	}

	public void moveRight()
	{
		double newX = this.dimension.getLocation().x + stride;
		this.dimension.setLocation(newX, dimension.getLocation().y);
	}

	@Override
	public String toString()
	{
		return "Pacman (Total Score: " + this.totalScore + ") "+ this.dimension;
	}

}
