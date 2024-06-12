public class Seat
{
	private String name;
	private Passenger passenger;

	public Seat(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean isAvailable()
	{
		if(this.passenger == null)
			return false;
		else
			return true;
	}
	public boolean setPassenger(Passenger passenger)
	{
		if(this.isAvailable())
			return true;
		else
		{
			this.passenger = passenger;
			return false;
		}
	}
	public Passenger getPassenger()
	{

		return this.passenger;
	}
	@Override
	public String toString()
	{
		return "["+(!this.isAvailable()?this.name:"XX")+"]";
	}
}