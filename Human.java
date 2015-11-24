import java.util.Random;

/**
 * Humans are a basic class in a war game between different races.
 * They have reletively low strength and hp.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Human extends Creature
{
    private Random rng;
    private static final int strMax = 18;
    private static final int hpMax = 30;

    /**
     * Constructor for human class
     * Generates random stats up to a cap
     */
    public Human()
    {
        super(strMax,hpMax);
    }
    
    public Human(int maxStr, int maxHp)
    {
        super(maxStr, maxHp);
    }
}