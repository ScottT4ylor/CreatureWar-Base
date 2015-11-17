
/**
 * Cyberdemons are a special class of Demons in a war game between
 * different races. They have nothing special compared to demons.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class CyberDemon extends Demon
{
    private int strength;
    private int hp;

    public CyberDemon(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
    }

}