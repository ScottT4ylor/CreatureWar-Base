import java.util.Random;
/**
 * Cyberdemons are a special class of Demons in a war game between
 * different races. They have nothing special compared to demons.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class CyberDemon extends Demon
{
    private int strength;
    private int hp;
    Random rng;

    /**
     * Constructor for CyberDemon class
     * Generates random stats up to a cap
     */
    public CyberDemon()
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
    
    public CyberDemon(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }

}