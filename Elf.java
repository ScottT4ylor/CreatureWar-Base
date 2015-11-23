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
    private int strength;
    private int hp;
    private Random rng;

    
    /**
     * Constructor for elf class
     * Generates random stats up to a cap
     */
    public Elf()
    {
        super();
        rng = new Random();
        strength = rng.nextInt(20)+5;
        hp = rng.nextInt(45)+5;
    }
        
    /**
     * Constructor with params passed in
     * 
     * @param strength how strong it is
     * @param hp how much life it has
     */
    
    public Elf(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
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