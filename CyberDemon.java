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
    Random rng;
    private static final int strMax = 45;
    private static final int hpMax = 40;

    /**
     * Constructor for CyberDemon class
     * Generates random stats up to a cap
     */
    public CyberDemon()
    {
        super(strMax,hpMax);
    }
}