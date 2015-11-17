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
    * Though it won't actually be called by the CreatureWar
    */
   public Creature()
   {
       hp = 10;
       strength = 10;
   }
   
   /**
    * constructor for the CreatureWar
    * 
    * @param hp the hp of the creature
    * @param strength the strength of the creature
    */
   public Creature(int hp, int strength)
   {
       this.hp = hp;
       this.strength = strength;
   }
   
   //fields
   
   /**
    * method to find damage dealt by an attack
    * 
    * @return int the damage to deal
    */
   public int damage()
   {
       rng = new Random();
       int dam = rng.nextInt(strength-1)+1;
       return dam;
   } 
   
}
