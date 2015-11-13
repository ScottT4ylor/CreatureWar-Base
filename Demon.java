import java.util.Random;
/**
 * Demons are a basic class in a war game between different races.
 * They have a magical attack that deals extra damage.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Demon extends Creature
{
    int strength;
    int hp;

    public Demon(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }

}