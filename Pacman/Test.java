public class Test
{
	public static void main(String[] args)
	{
		/*Pacman main = new Pacman(20.5, 15.80, 3, 3, 2.0);
		Pellet[] pellets = new Pellet[3];
		pellets[0] = new Pellet(20,11,1,1,5);
		pellets[1] = new Pellet(11.5,7.8,3,3,3);
		pellets[2] = new Pellet(14.2,12.7,0.4,0.4,8);

		System.out.println(main);
		for(Pellet p : pellets)
		    System.out.println(p + ((p.isVisible)? " can be eaten.":" is not visible."));
		System.out.println();

		for(int i=0; i < 4; i++)
		{
		    main.moveUp();
		    for(Pellet p : pellets)
		        main.eat(p);
		    System.out.println(main);
		    for(Pellet p : pellets)
		        System.out.println(p + ((p.isVisible)? " can be eaten.":" is not visible."));
		    System.out.println();
		}

		for(int i=0; i < 3; i++)
		{
		    main.moveLeft();
		    for(Pellet p : pellets)
		        main.eat(p);
		    System.out.println(main);
		    for(Pellet p : pellets)
		        System.out.println(p + ((p.isVisible)? " can be eaten.":" is not visible."));
		    System.out.println();
		}

		main.moveDown();
		for(Pellet p : pellets)
		    main.eat(p);
		System.out.println(main);
		for(Pellet p : pellets)
		    System.out.println(p + ((p.isVisible)? " can be eaten.":" is not visible."));
		System.out.println();*/
		Pacman pacman = new Pacman(0,0,2,2,2);
		Pellet p1 = new Pellet(4,10,1,1,3);
		System.out.println(pacman);
		System.out.println(p1 + ((p1.isVisible)? " can be eaten.":" is not visible."));

		pacman.eat(p1);
		System.out.println(pacman);
		System.out.println(p1 + ((p1.isVisible)? " can be eaten.":" is not visible."));

		pacman.moveRight();
		pacman.moveRight();
		pacman.moveDown();
		pacman.moveDown();
		pacman.moveDown();
		pacman.moveDown();
		pacman.moveDown();

		pacman.eat(p1);
		System.out.println(pacman);
		System.out.println(p1 + ((p1.isVisible)? " can be eaten.":" is not visible."));
	}
}