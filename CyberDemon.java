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
    int strength;
    int hp;

    public CyberDemon(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }

}