import java.util.Random;
/**
 * Champions are a special class of humans in a war game between
 * different races. They have higher life and a special ability
 * to block some damage when attacked.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Champion extends Human
{
    private Random rng;
    private static final int strMax = 25;
    private static final int hpMax = 65;
    
    /**
     * Constructor for champion class
     * Generates random stats up to a cap
     */
    public Champion()
    {
        super(strMax,hpMax);
    }
    
    public int reduceHP(int damage)
    {
       int newDamage = block(damage);
       //System.out.print("HP before:"+hp+" Taking: "+newDamage+" damage.\n");
       //System.out.println("HP after: "+hp);
       return super.reduceHP(newDamage);
    }

    public int block(int damage)
    {
        //System.out.print("Current HP: "+hp+" damage before block: "+damage);
        rng = new Random();
        if(rng.nextFloat() >= 0.95)
        {
            //System.out.print("Got special block. ");
            damage /= 2;
            //System.out.print("damage now at "+damage);
        }
        damage -= 4;
        //System.out.print("Soaked 4, damage now at "+damage+"\n");
        if (damage < 0)
        {
            damage = 0;
        }
        return damage;
    }
}