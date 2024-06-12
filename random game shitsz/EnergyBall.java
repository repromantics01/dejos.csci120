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
		else
			System.out.println("This energy ball is fully charged."); 
	}

	public int releaseEnergy()
	{
		int energyValue = this.energy;
		this.energy = 0;
		return energyValue;
	}

	@Override
	public void use()
	{
		System.out.println("This energy ball can't be used at this situation.");
	}

}	