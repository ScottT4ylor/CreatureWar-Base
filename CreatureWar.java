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
    private Creature fighter1;
    private Creature fighter2;
    private Random rng;
    
    
    /**
     * Constructor for objects of class CreatureWar
     */
    public CreatureWar()
    {
        army1 = new ArrayList<Creature>();
        army2 = new ArrayList<Creature>();
    }
    
    //methods
    
    /**
     * Runs the war between two armies
     */
    public void runWar(String ar1, String ar2)
    {
        int done = 0;
        generateArmies(ar1,ar2);
        //do more stuff
        while (done == 0)
        {
            runCombatTurn();
            if (army1.isEmpty())
            {
                if (army2.isEmpty())
                {
                    done = 3;
                }
                else
                {
                    done = 2;
                }
            }
            else if (army2.isEmpty())
            {
                done = 1;
            }
            else
            {
                System.out.println("Army 1 has "+army1.size()+" members left.\nArmy 2 has "+army2.size()+" members left.\n\n");
            }
        }
        switch(done)
        {
            case 1:
                System.out.println("\nArmy 1 won!");
                break;
            case 2:
                System.out.println("\nArmy 2 won!");
                break;
            case 3:
                System.out.println("\nBoth armies destroyed each other!");
                break;
            default:
                System.out.println("Debug: Something broke.");
        }
    }
    
    
    
    /**
     * Generates two armies to fight each other.
     */
    private void generateArmies(String ar1, String ar2)
    {
        rng = new Random();
        int soldiers;
        float classChance;
        String army1Type = null;
        String army2Type = null;
        
        System.out.println("Two armies meet in a narrow pass. Only one can be the victor.\n");
        
        /*
         * 
         * I'm thinking of changing the way this works. Instead of going for one race
         * per army, having the user able to specify multiple races in the army
         * 
         * It would use a regex to check if it contains different race names.
         * 
         */
        
        switch(ar1.toLowerCase())
        {
            case "human":
                army1Type = "humans";
                soldiers = rng.nextInt(500)+500;
                for(int i = 0 ; i < soldiers; i++)
                {
                    if (rng.nextFloat() >= 0.01)
                    {
                        army1.add(new Human());
                    }
                    else
                    {
                        army1.add(new Champion());
                    }
                }
                break;
            case "elf":
                army1Type = "elves";
                soldiers = rng.nextInt(300)+300;
                for(int i = 0 ; i < soldiers; i++)
                {
                    if (rng.nextFloat() >= 0.75)
                    {
                        army1.add(new Elf());
                    }
                    else
                    {
                        army1.add(new Archer());
                    }
                }
                break;
            case "demon":
                army1Type = "demons";
                soldiers = rng.nextInt(150)+100;
                classChance = rng.nextFloat();
                for(int i = 0 ; i < soldiers; i++)
                {
                    if (classChance >= 0.5)
                    {
                        army1.add(new Demon());
                    }
                    else if (classChance >=0.1)
                    {
                        army1.add(new CyberDemon());
                    }
                    else
                    {
                        army1.add(new Balrog());
                    }
                }
                break;
            default:
                System.out.println("Error: That isn't one of the available races.\nAvailbable races: Human, Elf, Demon");
        }
        
        //Then set up army 2
        
        switch(ar2.toLowerCase())
        {
            case "human":
                army2Type = "humans";
                soldiers = rng.nextInt(500)+500;
                for(int i = 0 ; i < soldiers; i++)
                {
                    if (rng.nextFloat() >= 0.10)
                    {
                        army2.add(new Human());
                    }
                    else
                    {
                        army2.add(new Champion());
                    }
                }
                break;
            case "elf":
                army2Type = "elves";
                soldiers = rng.nextInt(300)+300;
                for(int i = 0 ; i < soldiers; i++)
                {
                    if (rng.nextFloat() >= 0.20)
                    {
                        army2.add(new Elf());
                    }
                    else
                    {
                        army2.add(new Archer());
                    }
                }
                break;
            case "demon":
                army2Type = "demons";
                soldiers = rng.nextInt(150)+100;
                classChance = rng.nextFloat();
                for(int i = 0 ; i < soldiers; i++)
                {
                    if (classChance >= 0.5)
                    {
                        army2.add(new Demon());
                    }
                    else if (classChance >=0.1)
                    {
                        army2.add(new CyberDemon());
                    }
                    else
                    {
                        army2.add(new Balrog());
                    }
                }
                break;
            default:
                System.out.println("Error: That isn't one of the available races.\nAvailbable races: Human, Elf, Demon");
        }
        System.out.println("On one side stands an army of "+army1.size()+" "+army1Type+". On the other, an army of "+army2.size()+" "+army2Type+".\n");
    }
    
    
    
    /**
     * Runs one turn of combat
     */
    private void runCombatTurn()
    {
        fighter1 = army1.get(0);
        fighter2 = army2.get(0);
        int damage1 = fighter1.damage();
        int damage2 = fighter2.damage();
        System.out.println("Fighter 1 attacks for "+damage1+" damage.");
        if(fighter2 instanceof Champion)
        {
            System.out.println("Fighter 2 blocks the attack, reducing the damage.");
        }
        System.out.println("Fighter 2 attacks for "+damage2+" damage.\n");
        if(fighter1 instanceof Champion)
        {
            System.out.println("Fighter 1 blocks the attack, reducing the damage.");
        }
        fighter1.reduceHP(damage2);
        fighter2.reduceHP(damage1);
        System.out.println("");
        System.out.println("Fighter 1 has "+fighter1.getHP()+" hp left.");
        System.out.println("Fighter 2 has "+fighter2.getHP()+" hp left.\n");
        
        
        int archers1 = 0;
        int archers2 = 0;
        int archerKills1 = 0;
        int archerKills2 = 0;
        for(Creature backup : army1)
        {
            if (backup instanceof Archer)
            {
                archers1 += 1;
                rng = new Random();
                Archer cast = (Archer)backup;
                int spDamage = cast.rangedAttack();
                int target = rng.nextInt(army2.size()-1)+1;
                army2.get(target).reduceHP(spDamage);
                if(army2.get(target).isAlive() == false)
                {
                    archerKills1 += 1;
                }
            }
        }
        for(Creature backup : army2)
        {
            if (backup instanceof Archer)
            {
                archers2 += 1;
                rng = new Random();
                Archer cast = (Archer) backup;
                int spDamage = cast.rangedAttack();
                int target = rng.nextInt(army1.size()-1)+1;
                army1.get(target).reduceHP(spDamage);
                if(army1.get(target).isAlive() == false)
                {
                    archerKills2 += 1;
                }
            }
        }
        if (archers1 > 0 && archers2 == 0)
        {
            System.out.println("The first army's archers fire a volley of arrows, killing "+archerKills1+" enemies.");
        }
        else if (archers1 > 0 && archers2 > 0)
        {
            System.out.println("The both army's archers fire a volley of arrows, killing "+(archerKills1+archerKills2)+" troops.");
        }
        else if (archers1 == 0 && archers2 > 0)
        {
            System.out.println("The second army's archers fire a volley of arrows, killing "+archerKills2+" enemies.");
        }
        clearDead();
        System.out.println("");
    }
    
    
    /**
     * Clears each army of any dead members
     */
    private void clearDead()
    {
        for(int i = army1.size()-1 ; i >=0 ; i--)
        {
            if (army1.get(i).isAlive() == false)
            {
                army1.remove(i);
            }
        }
        
        for(int i = army2.size()-1 ; i>=0 ; i--)
        {
            if (army2.get(i).isAlive() == false)
            {
                army2.remove(i);
            }
        }
    }
}
