import java.util.Random;
/**
 * Elves are a basic class in a war game between different races.
 * They have a magical attack that deals double damage.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Elf extends Creature
{
    private Random rng;
    private static final int strMax = 25;
    private static final int hpMax = 50;

    
    /**
     * Constructor for elf class
     * Generates random stats up to a cap
     */
    public Elf()
    {
        super(strMax,hpMax);
    }
    
    /**
     * Constructor for elf class
     * Generates random stats up to a cap
     */
    public Elf(int maxStr, int maxHp)
    {
        super(maxStr,maxHp);
    }
    
    /**
     * overrides superclass damage function
     * calls superclass damage function, gets the damage to deal
     * and then rolls to find if it doubles it.
     */
    public int damage()
    {
        int dam = super.damage();
        rng = new Random();
        if (rng.nextFloat() >= 0.9)
        {
            dam *= 2;
        }
        return dam;
    }
}