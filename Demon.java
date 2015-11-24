import java.util.Random;
/**
 * Demons are a basic class in a war game between different races.
 * They have a magical attack that deals extra damage.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Demon extends Creature
{
    private Random rng;
    private static final int strMax = 45;
    private static final int hpMax = 40;

    /**
     * Constructor for demon class
     * Generates random stats up to a cap
     */
    public Demon()
    {
        super(strMax,hpMax);
    }
    
    /**
     * Constructor for demon class
     * Generates random stats up to a cap
     */
    public Demon(int maxStr, int maxHp)
    {
        super(maxStr,maxHp);
    }
    
    public int damage()
    {
        int dam = super.damage();
        rng = new Random();
        if (rng.nextFloat() >= 0.95)
        {
            dam += 50;
        }
        return dam;
    }

}