import java.util.Random;
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
    int strength;
    int hp;

    public Balrog(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }

}