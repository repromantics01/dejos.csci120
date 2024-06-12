public class Passenger
{
	private String name;
	public boolean isPWD;

	public Passenger(String name, boolean isPWD)
	{
		this.name = name;
		this.isPWD = isPWD;
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public boolean equals(Object o)
	{
		if(this.name == ((Passenger)o).name)
			return true;
		else
			return false;
	}
	@Override
	public String toString()
	{
		return this.name +((this.isPWD)?" [P]":"")+"\n";
	}
}