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
    private int strength;
    private int hp;
    private Random rng;
    
    /**
     * Constructor for champion class
     * Generates random stats up to a cap
     */
    public Champion()
    {
        super();
        rng = new Random();
        strength = rng.nextInt(20)+5;
        hp = rng.nextInt(60)+5;
    }
        
    /**
     * Constructor with params passed in
     * 
     * @param strength how strong it is
     * @param hp how much life it has
     */

    public Champion(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }
    
    public int reduceHP(int damage)
    {
       int newDamage = block(damage);
       System.out.print("HP before:"+hp+" Taking: "+newDamage+" damage.\n");
       hp -= newDamage;
       System.out.println("HP after: "+hp);
       return hp;
    }
    
    public int getHP()
    {
        return hp;
    }
    
    public int block(int damage)
    {
        System.out.print("Current HP: "+hp+" damage before block: "+damage);
        rng = new Random();
        if(rng.nextFloat() >= 0.95)
        {
            System.out.print("Got special block. ");
            damage /= 2;
            System.out.print("damage now at "+damage);
        }
        damage -= 4;
        System.out.print("Soaked 4, damage now at "+damage+"\n");
        if (damage < 0)
        {
            damage = 0;
        }
        return damage;
    }
}