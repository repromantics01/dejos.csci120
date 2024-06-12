public class PokemonGame
{
    public static void main(String[] args)
    {
        Move[] char_moves = new Move[5];

        char_moves[0] = new PureDamageMove("Scratch", 35, 40, 1);
        char_moves[1] = new PureDamageMove("Dragon Claw", 15, 80, 1);
        char_moves[2] = new InflictStatusMove("Thunder wave", 20, new Paralyze(2), 0.9);
        char_moves[3] = new PureDamageMove("Inferno", 5, 100, 0.5);
        char_moves[4] = new InflictStatusMove("Poison Powder", 35, new Poison(1), 0.75);

        LearnedMoveRoster lmr = new LearnedMoveRoster();
        lmr.addMove(char_moves[4], 5);
        lmr.addMove(char_moves[3], 75);
        lmr.addMove(char_moves[2], 10);

        Pokemon charizard = new Pokemon("Charizard",360, char_moves[0], char_moves[1], null, lmr);
        System.out.println(charizard);
        (charizard.getCurrentMoves()[0]).executeMove(charizard);
        System.out.println(charizard);

        for(int i = 0; i < 5; i++)
            charizard.levelUp(3,true);

        System.out.println(charizard);

    }
}
