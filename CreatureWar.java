import java.util.Random;
import java.util.ArrayList;
/**
 * This class runs a war between armies of creatures
 * 
 * @author Scott Taylor
 * @version 11/16/2015
 */
public class CreatureWar
{
    //fields
    private ArrayList<Creature> army1;
    private ArrayList<Creature> army2;
    private ArrayList<Integer> test;
    private Random rng;
    
    
    /**
     * Constructor for objects of class CreatureWar
     */
    public CreatureWar()
    {
        army1 = new ArrayList<Creature>();
        army2 = new ArrayList<Creature>();
        test = new ArrayList<Integer>();
        test.add(new Integer(5));
        army1.add(new Creature(5,5));
    }
    
    //methods
    
    /**
     * Runs the war between two armies
     */
    public void runWar(String ar1, String ar2)
    {
        generateArmies(ar1,ar2);
        //do more stuff
        
        
        
    }
    
    private void generateArmies(String ar1, String ar2)
    {
        rng = new Random();
        
        
        /*
         * 
         * I'm thinking of changing the way this works. Instead of going for one race
         * per army, having the user able to specify multiple races in the army
         * 
         * It would use a regex to check if it contains different race names.
         * 
         */

        
        
        
        int soldiers;
        switch(ar1)
        {
            case "human":
                soldiers = rng.nextInt(500)+500;
                for(int i = 0 ; i < soldiers; i++)
                {
                    if (rng.nextFloat() >= 0.95)
                    {
                        Creature  c = new Creature(5,5);
                        army1.add(c);
                    }
                    else
                    {
                        army1.add(new Human(rng.nextInt(),rng.nextInt()));
                    }
                }
                break;
            case "elf":
                soldiers = rng.nextInt(300)+300;
                //for loop
                break;
            case "demon":
                soldiers = rng.nextInt(150)+100;
                //for loop
                break;
            default:
                System.out.println("That isn't one of the available races.");
            }
    }
}
