
/**
 * Humans are a basic class in a war game between different races.
 * They have reletively low strength and hp.
 * 
 * @author Scott Taylor 
 * @version 11/13/2015
 */
public class Human extends Creature
{
    private int strength;
    private int hp;

    public Human(int strength, int hp)
    {
        super(strength,hp);
        this.strength = strength;
        this.hp = hp;
        if (this.strength > 18)
        {
            this.strength = 18;
        }
        if (this.hp > 30)
        {
            this.hp = 30;
        }
        
    }

}