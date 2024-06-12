public abstract class Consumable extends Item implements Chargeable
{
	private boolean consumed;
	private boolean spoiled;

	public Consumable(String name, int value, double weight, boolean spoiled)
	{
		super(name, value, weight);
		this.spoiled = spoiled;
		this.consumed = false;
	}

	public void setConsumed(boolean consumed){this.consumed = consumed;}

	public void charge(){}

	public boolean isConsumed(){return this.consumed;}
	public boolean isSpoiled(){return this.spoiled;}
}

class EnergyBall extends Consumable
{
	private int energy;
	private int capacity;

	public EnergyBall(int capacity)
	{
		super("energy ball", 0, 10, false);
		this.capacity = capacity;
		this.energy = 0;
	}

	@Override
	public void charge()
	{
		if(this.energy<this.capacity)
		{
			this.energy++;
		}
		System.out.println("This energy ball is fully charged."); 
	}

	public int releaseEnergyBall()
	{
		int energyValue = this.energy;
		this.energy = 0;
		return energyValue;
	}

	@Override
	public void use()
	{
		System.out.println("This energy ball can't be used at this stuation.");
	}

}