import java.util.*;

public class Pokemon
{
	private String name;
	private int maxHP;
	private int hp;
	private int level;

	private LearnedMoveRoster moveList;
	private Move[] currentMoves;
	private List<Status> statuses;

	public Pokemon(String name, int maxHP, Move defaultMove1, Move defaultMove2, Move defaulMove3, LearnedMoveRoster roster)
	{
		this.name = name;
		this.hp = this.maxHP = (maxHP<0)?0:maxHP;
		this.level = 1;
		this.moveList = roster;
		this.currentMoves = new Move[4];
		this.currentMoves[0] = defaultMove1;
		this.currentMoves[1] = defaultMove2;
		this.currentMoves[2] = defaulMove3;
		this.statuses = new ArrayList<Status>();
	}

	public String getName(){return this.name;}
	public int getMaxHP(){return this.maxHP;}
	public int getHP(){return this.hp;}
	public Move[] getCurrentMoves(){return this.currentMoves;}

	public void inflictDamage(int damage)
	{
		if(damage<0)
			return;
		this.hp = (damage>=this.hp)?0:this.hp-damage;
	}

	public boolean isFainted(){return this.hp == 0;}
	public void addStatus(Status status){this.statuses.add(status);}

	public void levelUp(int moveNumberToReplace, boolean replace)
	{
		this.level++;
		if(moveNumberToReplace < 1 || moveNumberToReplace>4 || replace)
			return;
		Move m = this.moveList.getMove(this.level);
		if(m!=null)
			this.currentMoves[moveNumberToReplace-1] = m;
	}

	@Override
	public String toString()
	{
		String result = "";

		result += this.name + "[" + this.hp + "/" + this.maxHP + "] Lv. " + this.level + "\n";
		result += "Moves:\n";
		for(Move m: this.currentMoves)
		{
			if(m!=null)
				result += m + "\n";
		}

		if(this.statuses.size() > 0)
		{
			for(Status s: this.statuses)
			{
				result += s + "\n";
			}
		}
		return result;
	}


}
