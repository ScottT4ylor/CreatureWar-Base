import java.util.Random;
/**
 * Balrog are a special class of demons in a war
 * game between different races. They have
 * the ability to attack twice per round.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Balrog extends Demon
{
    private int strength;
    private int hp;
    private Random rng;

    /**
     * Constructor for Balrog class
     * Generates random stats up to a cap
     */
    public Balrog()
    {
        super();
        rng = new Random();
        strength = rng.nextInt(24)+5;
        hp = rng.nextInt(65)+5;
    }
        
    /**
     * Constructor with params passed in
     * 
     * @param strength how strong it is
     * @param hp how much life it has
     */
    public Balrog(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }
    
     //To override damage function later
    public int damage()
    {
        int dam = 0;
        dam += super.damage();
        dam += super.damage();
        return dam;
    }

}