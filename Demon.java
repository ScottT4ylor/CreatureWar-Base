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
    private int strength;
    private int hp;
    private Random rng;

    /**
     * Constructor for demon class
     * Generates random stats up to a cap
     */
    public Demon()
    {
        super();
        rng = new Random();
        strength = rng.nextInt(40)+5;
        hp = rng.nextInt(35)+5;
    }
        
    /**
     * Constructor with params passed in
     * 
     * @param strength how strong it is
     * @param hp how much life it has
     */
    
    public Demon(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }
    
     //To override damage function later
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