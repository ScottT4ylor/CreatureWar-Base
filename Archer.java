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
    private Random rng;
    private int rangedCD;
    private static final int strMax = 20;
    private static final int hpMax = 25;
    
    /**
     * Constructor for Archer class
     * Generates random stats up to a cap
     */
    public Archer()
    {
        super(strMax,hpMax);
        rangedCD = 0;
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