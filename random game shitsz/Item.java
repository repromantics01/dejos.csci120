public abstract class Item implements ItemComparable
{
	private static int numberOfItems = 0;
	private int id;
	private int value;
	private String name;
	private double weight;

	public Item(String name, int value, double weight)
	{
		this.id = this.numberOfItems;
		this.numberOfItems++;
		this.name = name;
		this.value = value;
		this.weight = weight;
	}

	public abstract void use();

	public int getID(){return this.id;}	
	public int getValue(){return this.value;}
	public String getName(){return this.name;}
	public double getWeight(){return this.weight;}

	public void setValue(int value) {this.value = value;}
	public void setName(String name) {this.name = name;}
	public void setWeight(double weight) {this.weight = weight;}

	@Override 
	public int compareByValue(Item i){return this.value - i.getValue();}

	@Override
	public int compareByWeight(Item i)
	{
		if(this.weight>i.getWeight()) return 1;
		else if(this.weight<i.getWeight()) return -1;
		else return 0;
	}
}