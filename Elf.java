import java.util.Random;
/**
 * Elves are a basic class in a war game between different races.
 * They have a magical attack that deals double damage.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Elf extends Creature
{
    int strength;
    int hp;

    public Elf(int strength, int hp)
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