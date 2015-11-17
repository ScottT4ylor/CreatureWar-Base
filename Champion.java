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

    public Champion(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }

}