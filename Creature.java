import java.util.Random;
/**
 * This class is the superclass for various races
 * that will fight against each other until
 * one army is defeated.
 * 
 * @author Scott Taylor
 * @version 11/16/2015
 */
public class Creature
{
   //fields
   
   private int hp;
   private int strength;
   private Random rng;
   
   
   //constructors
   
   /**
    * no arg constructor
    * Generates random stats for the creature
    */
   public Creature()
   {
       hp = 5;
       strength = 5;
   }
   
   /**
    * constructor for the CreatureWar
    * 
    * For if it would be called with stats passed into it.
    * 
    * @param hp the hp of the creature
    * @param strength the strength of the creature
    */
   public Creature(int hp, int strength)
   {
       this.hp = hp;
       this.strength = strength;
   }
   
   //methods
   
   /**
    * method to find damage dealt by an attack
    * 
    * @return int the damage to deal
    */
   public int damage()
   {
       System.out.println("Current creature has hp/str of: " +hp+"/"+strength);
       rng = new Random();
       int dam = rng.nextInt(strength-1)+1;
       return dam;
   } 
   
   public int reduceHP(int damage)
   {
       hp -= damage;
       return hp;
   }
   
   public int getHP()
   {
       return hp;
   }
   
   public boolean isAlive()
   {
       if (hp > 0)
           return true;
       else
            return false;
           
    }
}
