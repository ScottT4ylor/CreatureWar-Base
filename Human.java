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
    private int strength;
    private int hp;
    private Random rng;

    /**
     * Constructor for human class
     * Generates random stats up to a cap
     */
    public Human()
    {
        super();
        rng = new Random();
        strength = rng.nextInt(13)+5;
        hp = rng.nextInt(25)+5;
    }
        
    /**
     * Constructor with params passed in
     * 
     * @param strength how strong it is
     * @param hp how much life it has
     */
    public Human(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
        if (this.strength > 18)
        {
            this.strength = 18;
        }
        if (this.hp > 30)
        {
            this.hp = 30;
        }
        
    }

}