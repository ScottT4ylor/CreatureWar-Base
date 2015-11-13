import java.util.Random;
/**
 * Humans are a basic class in a war game between different races.
 * They have reletively low strength and hp.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Human extends Creature
{
    int strength;
    int hp;

    public Human(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }

}