import java.util.Random;
/**
 * Archers are a special class of elves in a war game between
 * different races. They have the ability to attack from range.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Archer extends Elf
{
    private int strength;
    private int hp;
    private Random rng;
    private int rangedCD;
    
    /**
     * Constructor for Archer class
     * Generates random stats up to a cap
     */
    public Archer()
    {
        super();
        rangedCD = 0;
        rng = new Random();
        strength = rng.nextInt(15)+5;
        hp = rng.nextInt(20)+5;
    }
        
    /**
     * Constructor with params passed in
     * 
     * @param strength how strong it is
     * @param hp how much life it has
     */
    public Archer(int strength, int hp)
    {
        super(strength,hp);
        rangedCD = 0;
        this.strength = strength;
        this.hp = hp;
    }
    
    public int rangedAttack()
    {
        int dam;
        if(rangedCD == 0)
        {
            rng = new Random();
            dam = super.damage()/2;
            rangedCD = rng.nextInt(3);
        }
        else
        {
            dam = 0;
            rangedCD -= 1;
        }
        return dam;
    }
}