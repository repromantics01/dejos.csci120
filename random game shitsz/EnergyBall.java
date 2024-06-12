public class EnergyBall extends Consumable implements Chargeable
{
	private int energy;
	private int capacity;

	public EnergyBall(int capacity)
	{
		super("energy ball",0,10,false);
		this.capacity = capacity;
		this.energy = 0;
	}

	public int releaseEnergy()
	{
		int tempEnergy = this.energy;
		this.energy = 0;
		return tempEnergy;
	}

	@Override
	public void use()
	{
		if(this.energy==0)
			System.out.println("This "+super.getName()+" can't be used at this situation.");
		else
			System.out.println("You are using this " + super.getName()+".");
	}

	@Override
	public void charge()
	{
		if(this.energy < this.capacity)
			this.energy++;
		else
			System.out.println("The "+super.getName()+" is fully charged.");
	}
}