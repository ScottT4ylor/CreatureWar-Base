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
    int strength;
    int hp;

    public Archer(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }
    
     //To override damage function later
    public int damage()
    {
        return super.damage();
    }

}