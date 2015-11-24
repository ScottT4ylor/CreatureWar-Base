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
    private static final int strMax = 45;
    private static final int hpMax = 40;
    /**
     * Constructor for Balrog class
     * Generates random stats up to a cap
     */
    public Balrog()
    {
        super(strMax,hpMax);
    }
    
    public int damage()
    {
        int dam = 0;
        dam += super.damage();
        dam += super.damage();
        return dam;
    }

}