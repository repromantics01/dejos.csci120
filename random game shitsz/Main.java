public class Main
{
	public static void main(String[] args)
	{
		Consumable c = new Potion("small HP", 100, 50);
		System.out.println(c.isConsumed());
		c.use();
		System.out.println(c.isConsumed());	
		System.out.println();

		Consumable c2 = new Potion("small HP", 100, 50);
		System.out.println(c2.isSpoiled());
		System.out.println();

		Consumable c3 = new Potion("small HP", 100, 50);
		System.out.println(c3.isConsumed());
		c3.setConsumed(true);
		System.out.println(c3.isConsumed());	
		System.out.println();

		
		EnergyBall e = new EnergyBall(2);
		System.out.println(e.getName());
		System.out.println(e.getValue());
		System.out.println(e.getWeight());
		System.out.println(e.isSpoiled());
		System.out.println();

		e.charge();
		System.out.println(e.releaseEnergy());
		System.out.println(e.releaseEnergy());
		System.out.println();

		EnergyBall e2 = new  EnergyBall(2);
		e.use();

			

	}
}