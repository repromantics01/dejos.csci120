import java.util.*;
public class Airplane
{
	private String name;
	private int economyCapacity;
	private int businessClassCapacity;
	private int numEconomyPassangers;
	private int numBusinessClassPassanger;
	public ArrayList<Seat> businessClassSeats;
	public ArrayList<Seat> economySeats;

	public Airplane(String name)
	{
		this.name = name;
		this.economyCapacity = 49;
		this.businessClassCapacity = 0;
		this.numEconomyPassangers = 0;
		this.numBusinessClassPassanger = 0;

		this.businessClassSeats = new ArrayList<Seat>();
		this.economySeats = new ArrayList<Seat>();

		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				char c = (char)(65+j);
				this.economySeats.add(new Seat((i+1)+""+c));
			}
		}

	}

	public void setEconomyCapacity(int capacity)
	{
		if(capacity <0)
		{
			capacity = 0;
		}
		else if(capacity >49)
		{
			capacity = 49;
		}
		if(this.numEconomyPassangers == 0 && this.numBusinessClassPassanger == 0)
		{
			this.economyCapacity = capacity;
		}
	}

	public void setBusinessClassCapacity(int capacity)
	{
		if(capacity <0)
		{
			capacity = 0;
		}
		else if(capacity >49)
		{
			capacity = 49;
		}
		if(this.numEconomyPassangers == 0 && this.numBusinessClassPassanger == 0)
		{
			this.numBusinessClassPassanger = capacity;
		}
	}

	public boolean bookPassenger(Passenger passenger,String seatName, BookingType type)
	{
		return false;
	}

	@Override
	public String toString()
	{
		String result = this.name + "\n\n";
		int ctr = 0;

		if(this.numEconomyPassangers + this.numBusinessClassPassanger == this.economyCapacity + this. businessClassCapacity)
		{
			result += "Fully Booked.";
		}
		else
		{
			if(businessClassCapacity>0)
			{
				for(Seat s: this.businessClassSeats)
				{
					result += s + "  ";
					if(++ctr%4==0)
						result += "\n";
				}
				result += "\n";
			}

			ctr = 0;
			for(Seat s: this.economySeats)
			{
				result += s + " ";
				if(ctr%7==1||ctr%7==4)
					result +="  ";
				if(++ctr%7==0)
					result += "\n";
			}
		}

		return result;
	}
}
