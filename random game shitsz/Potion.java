public class Potion extends Consumable
{
	private int points;


	public Potion(String name, int points, int value)
	{
		super(name, value,0,false);
		this.points = points;
	}

	public int getPoints(){return this.points;}

	@Override
	public boolean isConsumed()
	{
		if(super.isConsumed()==false)
			return false;
		else
			return true;
	}

	@Override
	public void use()
	{ 
		super.setConsumed(true); 
		System.out.println("The " + super.getName() + " was consumed.");
	}
}