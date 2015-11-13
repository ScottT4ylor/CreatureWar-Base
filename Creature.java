import java.util.Random;
/**
 * This class is the superclass for various races
 * that will fight against each other until
 * one army is defeated.
 * 
 * @author Scott Taylor
 * @version 11/13/2015
 */
public class Creature
{
   private int hp;
   private int strength;
   Random rng;
   
   public Creature(int hp, int strength)
   {
       this.hp = hp;
       this.strength = strength;
   }
    
   public int damage()
   {
       rng = new Random();
       int dam = rng.nextInt(strength);
       if (dam < 5)
       {
           dam = 5;
       }
        return dam;
   } 
}
